package com.korea.productApp.dto;

import com.korea.productApp.entity.ProductEntity;

import lombok.Data;

@Data
public class ProductDTO {
	
	private int id;
	private String name;
	private int price;
	private int stock;
	
//Entity ->DTO
public ProductDTO(ProductEntity entity){
	this.id=entity.getId();
	this.name=entity.getName();
	this.price=entity.getPrice();
	this.stock=entity.getStock();
	
}
// DTO -> Entity
public ProductEntity toEntity(ProductDTO dto){
	int id = this.getId();
	String name =this.getName();
	int price = this.getPrice();
	int stock = this.getStock();
	return toEntity(dto);
	
	 
	
}

}
