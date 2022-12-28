package com.capgemini.assessment.Demo.eo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.assessment.Demo.MapStruct.MapStructMapper;
import com.capgemini.assessment.Demo.dto.ItemDto;
import com.capgemini.assessment.Demo.entity.Item;
import com.capgemini.assessment.Demo.repository.ItemRepository;

@Component
public class ItemEoImpl implements ItemEo{
	
	@Autowired
	private ItemRepository itemRepo;
	
	@Autowired
	private MapStructMapper mapStruct;

	

	static final Logger LOGGER= LoggerFactory.getLogger(ItemEo.class);
	public String ServiceLog() {
		LOGGER.info("This is a Employee Entity Eo File");
		LOGGER.warn("This is a 	Warn Message");
		LOGGER.error("This is an Error Message");
		return "ServiceLog";
	}
	@Override
	public List<ItemDto> getAllItems() {
		List<ItemDto> allEmployees = itemRepo.getAllItems();
		return allEmployees;
	}

	@Override
	public ItemDto getItem(int itemId) {
		return itemRepo.getItem(itemId);
	}

	@Override
	public int addItem(ItemDto id) {
		return itemRepo.addItem(id);
	}

	@Override
	public String  deleteItem(int id) {
		int response = itemRepo.deleteItem(id);
		if(response!=0) {
		return "Item deleted successfully";
		}
		return "Item not found";
	}

}
