package com.korea.product.service;

import com.korea.product.dto.ProductDTO;
import com.korea.product.model.ProductEntity;
import com.korea.product.persistence.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductDTO createProduct(ProductDTO dto) {

        // 검증
        if (dto.getName() == null || dto.getName().trim().isEmpty()) {
            throw new RuntimeException("상품명은 필수입니다.");
        }
        if (dto.getPrice() < 0) {
            throw new RuntimeException("가격은 0 이상이어야 합니다.");
        }
        if (dto.getStock() < 0) {
            throw new RuntimeException("재고는 0 이상이어야 합니다.");
        }

        // DTO → Entity 변환
        ProductEntity entity = ProductEntity.builder()
                .name(dto.getName())
                .price(dto.getPrice())
                .stock(dto.getStock())
                .description(dto.getDescription())
                .build();

        // DB 저장
        ProductEntity saved = productRepository.save(entity);

        // 저장된 Entity → DTO 반환
        return ProductDTO.builder()
                .id(saved.getId())
                .name(saved.getName())
                .price(saved.getPrice())
                .stock(saved.getStock())
                .description(saved.getDescription())
                .build();
    }
}