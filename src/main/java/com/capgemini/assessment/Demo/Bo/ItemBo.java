package com.capgemini.assessment.Demo.Bo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.capgemini.assessment.Demo.dto.ItemDto;
import com.capgemini.assessment.Demo.eo.ItemEo;

@Repository
public interface ItemBo {
	static final Logger LOGGER= LoggerFactory.getLogger(ItemEo.class);
	public default String ServiceLog() {
		LOGGER.info("This is a Employee Bo File");
		LOGGER.warn("This is a 	Warn Message");
		LOGGER.error("This is an Error Message");
		return "ServiceLog";
	}
public List<ItemDto> getAllItems();
	
	public ItemDto getItem(int itemId);
	
	public int addItem(ItemDto id);
	
	public String deleteItem(int id);

}
