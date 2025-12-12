package com.korea.productApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.korea.productApp.dto.ProductDTO;
import com.korea.productApp.dto.ResponseDTO;
import com.korea.productApp.entity.ProductEntity;



@ResponseBody
@Controller
public class ProductController {
	
	@PostMapping
	public ResponseDTO<?> postProducts(ProductEntity entity){
		
	} 
	
	@PutMapping
	@PathVariable("/post/{id}")
	public ResponseDTO<?> 
	@PutMapping
	@PathVariable("/read/{id}")
	public ResponseDTO<?> 
	@DeleteMapping
	@PathVariable("/delete/{id}")
	public ResponseDTO<?> 
	

}
