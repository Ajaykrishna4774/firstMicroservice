package com.capgemini.assessment.Demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.assessment.Demo.dto.ItemDto;
import com.capgemini.assessment.Demo.entity.Item;


import java.util.List;

@Repository
public class ItemRepository {

    @Autowired
    JdbcTemplate template;

   /*Getting all Items from table*/
    public List<ItemDto> getAllItems(){
        List<ItemDto> items = template.query("select id, name,category from item",(result,rowNum)->new ItemDto(result.getInt("id"),
                result.getString("name"),result.getString("category")));
        return items;
    }
    
    /*Getting a specific item by item id from table*/
    public ItemDto getItem(int itemId){
        String query = "SELECT * FROM ITEM WHERE ID=?";
        ItemDto item = template.queryForObject(query,new Object[]{itemId},new BeanPropertyRowMapper<>(ItemDto.class));

        return item;
    }
    
    /*delete an item from database*/
    public int deleteItem(int id){
        String query = "DELETE FROM ITEM WHERE ID =?";
        return template.update(query,id);
    }
    
    /*Adding an item into database table*/
	public int addItem(ItemDto id) {
		String query = "INSERT INTO ITEM VALUES(?,?,?)";
        return template.update(query,new Object[] {id.getId(), id.getName(), id.getCategory()});
		
	}

}