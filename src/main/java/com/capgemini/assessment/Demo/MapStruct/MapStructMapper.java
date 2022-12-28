package com.capgemini.assessment.Demo.MapStruct;

import java.util.List;

import org.mapstruct.Mapper;

import com.capgemini.assessment.Demo.dto.ItemDto;
import com.capgemini.assessment.Demo.entity.Item;

@Mapper(componentModel="spring")
public interface MapStructMapper {
	
	ItemDto itemToItemDto(Integer id);
	
	ItemDto itemToItemDto(Item item);
	
	Item itemDtoToItem(ItemDto item);
	
	List<ItemDto> itemToItemDtoList(List<Item> list);
	
	List<ItemDto> itemDtoToItemList(List<ItemDto> list);	
	
}
