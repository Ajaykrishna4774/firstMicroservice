package com.capgemini.assessment.Demo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table
public class ItemDto {
	
	@Id
    private int id;
	
    @NotNull(message = "Employee Name is Required")
    @Size(max=15,min=3,message="Name is not Valid")
    private String name;
    
    @NotNull(message = "Category is Required")
    @Size(max=20, min=2,message="Category is not Valid")
    private String category;

    public ItemDto() {
    }

    public ItemDto(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
