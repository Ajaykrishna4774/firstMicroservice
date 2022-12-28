package com.capgemini.assessment.Demo.MapStruct;

import com.capgemini.assessment.Demo.dto.ItemDto;
import com.capgemini.assessment.Demo.entity.Item;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-26T20:42:07+0530",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.5 (Eclipse Adoptium)"
)
@Component
public class MapStructMapperImpl implements MapStructMapper {

    @Override
    public ItemDto itemToItemDto(Integer id) {
        if ( id == null ) {
            return null;
        }

        ItemDto itemDto = new ItemDto();

        itemDto.setId( id );

        return itemDto;
    }

    @Override
    public ItemDto itemToItemDto(Item item) {
        if ( item == null ) {
            return null;
        }

        ItemDto itemDto = new ItemDto();

        itemDto.setId( item.getId() );
        itemDto.setName( item.getName() );
        itemDto.setCategory( item.getCategory() );

        return itemDto;
    }

    @Override
    public Item itemDtoToItem(ItemDto item) {
        if ( item == null ) {
            return null;
        }

        Item item1 = new Item();

        item1.setId( item.getId() );
        item1.setName( item.getName() );
        item1.setCategory( item.getCategory() );

        return item1;
    }

    @Override
    public List<ItemDto> itemToItemDtoList(List<Item> list) {
        if ( list == null ) {
            return null;
        }

        List<ItemDto> list1 = new ArrayList<ItemDto>( list.size() );
        for ( Item item : list ) {
            list1.add( itemToItemDto( item ) );
        }

        return list1;
    }

    @Override
    public List<ItemDto> itemDtoToItemList(List<ItemDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ItemDto> list1 = new ArrayList<ItemDto>( list.size() );
        for ( ItemDto itemDto : list ) {
            list1.add( itemDto );
        }

        return list1;
    }
}
