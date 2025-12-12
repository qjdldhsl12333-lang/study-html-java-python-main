package com.korea.product.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.korea.product.entity.ProductEntity;
import com.korea.product.persistence.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;

@Service

@RequiredArgsConstructor
public class ProductService {
//	- 상품 등록 로직을 작성한다.
//	- name이 null 또는 빈 문자열이면 예외 발생
//	- price < 0 예외
//	- stock <0 예외
//	- 검증에 통과하면 Repository를 이용해 저장
	private final ProductRepository repository;
		public List<ProductEntity> createProduct(ProductEntity entity){
		// 1. name 검증 로직 추가
        if (entity.getProductName() == null || !StringUtils.hasText(entity.getProductName())) {
            throw new RuntimeException("상품명은 필수 입력 항목입니다.");
        }
        
        // 2. price 검증 로직 추가
        if (entity.getProductPrice() < 0) {
            throw new RuntimeException("상품 가격은 0 미만일 수 없습니다.");
        }
        
        // 3. stock 검증 로직 추가
        if (entity.getProductStock() < 0) {
            throw new RuntimeException("재고 수량은 0 미만일 수 없습니다.");
        }
        
		repository.save(entity);
		return repository.findAll();
			}
	
	public List<ProductEntity> getAllProduct(){
		 List<ProductEntity> entities = repository.findAll();
		 return entities;
	}
	
	
	public List<ProductEntity> updateProduct(ProductEntity entity){
		
		ProductEntity target = repository.findById(entity.getProductId())
				.orElseThrow(() -> new RuntimeException("User not found"));
		
		target.setProductName(entity.getProductName());
		target.setProductPrice(entity.getProductPrice());
		target.setProductStock(entity.getProductStock());
		
		repository.save(target);
		
		return repository.findAll();
		
	}
	
	public List<ProductEntity> deleteProduct(int id){
		ProductEntity target = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("User not found"));
		
		repository.deleteById(id);
		
		return repository.findAll();
		
	}
	
	

}
