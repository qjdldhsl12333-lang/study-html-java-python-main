package com.korea.product.controller;

import com.korea.product.dto.ProductDTO;
import com.korea.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ProductDTO createProduct(@RequestBody ProductDTO requestDto) {
        return productService.createProduct(requestDto);
    }
}