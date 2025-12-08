package com.korea.product.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor 
@Builder 
public class ProductDTO {
    private Integer id;
    private String name;
    private int price;
    private int stock;
    private String description;
}