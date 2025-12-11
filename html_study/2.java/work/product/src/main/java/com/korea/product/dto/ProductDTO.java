package com.korea.product.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.korea.product.entity.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ProductDTO {
//	- int id
//	- String name
//	- int stock
//	- String description'
	int id;
	String name;
	int price;
	int stock;
	@CreationTimestamp
	LocalDateTime registerTime;
	@UpdateTimestamp
	LocalDateTime updateTime;
	
	  // Entity → DTO
    public ProductDTO(ProductEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.price = entity.getPrice();
        this.stock = entity.getStock();
        this.registerTime = entity.getRegisterTime();
        this.updateTime = entity.getUpdateTime();
    }
    
    public static ProductEntity toEntity(ProductDTO dto) {
    	
		return ProductEntity.builder()
                .name(dto.getName())
                .price(dto.getPrice())
                .stock(dto.getStock())
                .build();
	}
}
	
