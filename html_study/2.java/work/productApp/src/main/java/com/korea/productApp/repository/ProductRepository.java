package com.korea.productApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korea.productApp.dto.ProductDTO;
import com.korea.productApp.entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, ProductDTO> {
}
