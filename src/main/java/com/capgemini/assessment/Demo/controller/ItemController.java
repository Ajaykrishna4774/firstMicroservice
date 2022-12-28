package com.capgemini.assessment.Demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capgemini.assessment.Demo.MapStruct.MapStructMapper;
import com.capgemini.assessment.Demo.dto.ItemDto;
import com.capgemini.assessment.Demo.service.ItemServiceImpl;


@RestController
public class ItemController {
    
	@Autowired
    private ItemServiceImpl service;
	
	@Autowired
	private MapStructMapper mapStruct;
	
	private static final Logger LOGGER= LoggerFactory.getLogger(ItemController.class);

    @RequestMapping("/getAllItems")
    public List<ItemDto> getAllItems(){
    	LOGGER.info("inside class !!! ItemController, method!!!: getAllItems");
        return service.getAllItems();
    }

    @GetMapping("/getItem/{id}")
    public ItemDto getItem(@PathVariable int id){
    	LOGGER.info("inside class !!! ItemController, method!!!: getItem");
        return service.getItem(id);
    }

    @PostMapping("/items")
    public String addItem( @RequestBody ItemDto id) {
    	LOGGER.info("inside class !!! ItemController, method!!!: addItem");
    	return service.addItem(id)+"New Details added successfully";
    }
    
    @DeleteMapping("/deleteItem/{id}")
    public String deleteItem(@PathVariable int id){
    	LOGGER.info("inside class !!! ItemController, method!!!: deleteItem");
    		return service.deleteItem(id);
        
    }
    @GetMapping("/Health")
    public String HealthCheck() {
    	LOGGER.info("Health check");
    	return "Status : up ";
    }
}