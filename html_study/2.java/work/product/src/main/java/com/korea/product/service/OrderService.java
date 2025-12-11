package com.korea.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.product.dto.OrderDTO;
import com.korea.product.persistence.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
	
	private final OrderRepository orderRepository;
	
	//주문내역 조회하기
	public List<OrderDTO> getAllOrderTotalPrices(){
		List<Object[]> results = orderRepository.findAllOrderTotalPrices();
		return OrderDTO.toListOrderDTO(results);
	}

}
