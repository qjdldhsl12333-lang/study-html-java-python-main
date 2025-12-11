package com.korea.product.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korea.product.entity.ProductEntity;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{
//	- JpaRepository<> 상속
//	- 추가메서드는 필요 없음
	
}
