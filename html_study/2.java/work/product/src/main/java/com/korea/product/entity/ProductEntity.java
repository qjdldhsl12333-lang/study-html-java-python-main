package com.korea.product.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
public class ProductEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // auto increment
//	- int id pk, 자동증가
//	- String name
//	- int price
//	- int stock
//	- String description
	private int id;
    private String name;
    private int price;
    private int stock;
    
    @CreationTimestamp
    // Insert 쿼리가 발생했을때  현 시간 값을 적용시켜준다
    
    private LocalDateTime registerTime;
    
    @UpdateTimestamp
    // Update 쿼리가 발생했을 떄 현재 시간 값을 적용시켜준다 
    //값이 없으면 CreationTimeStamp같이 생성 시점이 한 번 기록될 수 있다
    private LocalDateTime updateTime;

}
