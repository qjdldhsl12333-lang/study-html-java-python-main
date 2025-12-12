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
	int productId;
	String productName;
	int productPrice;
	int productStock;
	@CreationTimestamp
	LocalDateTime registerTime;
	@UpdateTimestamp
	LocalDateTime updateTime;
	
	  // Entity → DTO
    public ProductDTO(ProductEntity entity) {
        this.productId = entity.getProductId();
        this.productName = entity.getProductName();
        this.productPrice = entity.getProductPrice();
        this.productStock = entity.getProductStock();
        this.registerTime = entity.getRegisterTime();
        this.updateTime = entity.getUpdateTime();
    }
    
    public static ProductEntity toEntity(ProductDTO dto) {
    	
		return ProductEntity.builder()
                .productName(dto.getProductName())
                .productPrice (dto.getProductPrice())
                .productStock(dto.getProductStock())
                .build();
	}
}
	
