package com.capgemini.assessment.Demo.Bo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.assessment.Demo.MapStruct.MapStructMapper;
import com.capgemini.assessment.Demo.dto.ItemDto;
import com.capgemini.assessment.Demo.eo.ItemEo;

@Component
public class ItemBoImpl implements ItemBo {
	
	@Autowired 
	private ItemEo eo;
	
	@Autowired
	private MapStructMapper  mapStruct;
	
	static final Logger LOGGER= LoggerFactory.getLogger(ItemBoImpl.class);
	public String ServiceLog() {
		LOGGER.info("This is a Employee Bo File");
		LOGGER.warn("This is a 	Warn Message");
		LOGGER.error("This is an Error Message");
		return "ServiceLog";
	}

	@Override
	public List<ItemDto> getAllItems() {
		List<ItemDto> allEmployees = eo.getAllItems();
		return allEmployees;
	}

	@Override
	public ItemDto getItem(int itemId) {
		return eo.getItem(itemId);
	}

	@Override
	public int addItem(ItemDto id) {
		return eo.addItem(id);
	}

	@Override
	public String  deleteItem(int id) {
		return eo.deleteItem(id);
		
	}
	

}
