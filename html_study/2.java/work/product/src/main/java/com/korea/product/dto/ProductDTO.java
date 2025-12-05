package com.korea.product.dto;

import jakarta.persistence.Id;


public class ProductDTO {
	
	@Id
	
	int id;
	String name;
	int price;
	int stock;
	String description;

}
