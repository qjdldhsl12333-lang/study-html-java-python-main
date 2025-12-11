package com.korea.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.dto.ProductDTO;
import com.korea.product.dto.ResponseDTO;
import com.korea.product.entity.ProductEntity;
import com.korea.product.service.ProductService;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(originPatterns = "*", allowCredentials = "false") // 또는 실제 프론트 주소

@RestController
@RequestMapping("product")
public class ProductController {
	
	 private ProductService service;
	 
	public ProductController (ProductService service){
		this.service = service;
	}
		@PostMapping("/create")	public ResponseEntity<?> createProduct(@RequestBody ProductDTO dto) {	
		// dto -> entity 변환		ProductEntity entity = ProductDTO.toEntity(dto);
		
		List<ProductEntity> entities = service.createProduct(entity);
		//eToDTO메서드를 호출하면서 db에서 가져온 데이터들이 담긴 List를 인자로 전달한다
		return ResponseEntity.ok(eToDTO(entities));
	}

	@GetMapping("/read")
	public ResponseEntity<?> getAllProduct() {
		List<ProductEntity> entities = service.getAllProduct();
		return ResponseEntity.ok(eToDTO(entities));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateProduct(@PathVariable("id") int id, @RequestBody ProductDTO dto){
		// dto -> entity 변환
		ProductEntity entity = ProductDTO.toEntity(dto);
		entity.setId(id);
		
		List<ProductEntity> entities = service.updateProduct(entity);
		return ResponseEntity.ok(eToDTO(entities));
	}
	
	 @DeleteMapping("/{id}")
	 public ResponseEntity<?> deleteProduct(@PathVariable("id") int id){
		 List<ProductEntity> entities = service.deleteProduct(id);
		 return ResponseEntity.ok(eToDTO(entities));

	 }
	 
	 // 공통 메서드 분리 entity -> dto 변환 후 responseDTO로 감싸기
	 public static ResponseDTO<ProductDTO> eToDTO(List<ProductEntity> entities){
		
		List<ProductDTO> dtos = entities.stream()
				.map(ProductDTO::new)
				.toList();
		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder()
						.data(dtos)
						.build();
		return response;
	 }
	
	
	
	
	
}
