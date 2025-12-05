package com.korea.product.model;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.NoArgsConstructor;
@Builder
@Entity
@NoArgsConstructor

public class ProductEntity {
	
	int id;
	String name;
	int price;
	int stock;
	String descript;
	

}
