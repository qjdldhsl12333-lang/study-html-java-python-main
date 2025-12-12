package com.korea.product.controller;

import java.util.List;

import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.dto.T_ORDERDTO;
import com.korea.product.dto.ResponseDTO;
import com.korea.product.service.T_ORDERS_Service;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("orders")
public class T_ORDERS_Controller {
	private final T_ORDERS_Service orderService;
	
	@GetMapping("/total")
	public ResponseEntity<?> getAllOrderTotals(){
		//service 계층에서 전체 데이터를 조회하여 List<OrderDTO>에 대입한다
		List<T_ORDERDTO> list = orderService.getAllOrderTotalPrices();
		//ResponseDTO의 data필드에 넣는다.
		ResponseDTO<T_ORDERDTO> response = ResponseDTO.<T_ORDERDTO>builder()
													.data(list)
													.build();
		//http 코드 200 과 함꼐 body에 응답(response)을 실어서 보낸다.
		return ResponseEntity.ok().body(response);
	}
	@PostMapping
	public ResponseEntity<?> saveOrder(@RequestBody OrderDto dto){
		List
	}
}
