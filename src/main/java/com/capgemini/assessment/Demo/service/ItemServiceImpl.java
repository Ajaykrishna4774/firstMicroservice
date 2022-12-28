package com.capgemini.assessment.Demo.service;

import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capgemini.assessment.Demo.Bo.ItemBo;
import com.capgemini.assessment.Demo.MapStruct.MapStructMapper;
import com.capgemini.assessment.Demo.controller.ItemController;
import com.capgemini.assessment.Demo.dto.ItemDto;
import com.capgemini.assessment.Demo.entity.Item;
import com.capgemini.assessment.Demo.repository.ItemRepository;
import com.capgemini.assessment.Demo.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemBo bo;
	
	@Autowired 
	private MapStructMapper mapStruct;
	
	private static final Logger LOGGER= LoggerFactory.getLogger(ItemServiceImpl.class);
	public String ServiceLog() {
		LOGGER.info("This is a Emplpyee service Layer ");
		return "ServiceLog";
	}
	
	@Override
	public List<ItemDto> getAllItems() {
		List<ItemDto> allEmployees = mapStruct.itemDtoToItemList(bo.getAllItems());
		
		return allEmployees;
	}

	@Override
	public ItemDto getItem(int itemId) {
		return bo.getItem(itemId);
	}

	public int addItem(ItemDto id){
		
		return bo.addItem(id);
	}

	@Override
	public String deleteItem(int id) {
		return bo.deleteItem(id);
	}

}
