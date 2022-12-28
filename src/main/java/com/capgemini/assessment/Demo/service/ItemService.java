package com.capgemini.assessment.Demo.service;

import java.util.List;

import com.capgemini.assessment.Demo.dto.ItemDto;
import com.capgemini.assessment.Demo.entity.Item;

public interface  ItemService {
	
	List<ItemDto>  getAllItems();
	
	ItemDto getItem(int itemId);
	
	int addItem(ItemDto i);
	
	String deleteItem(int id);
	

}
