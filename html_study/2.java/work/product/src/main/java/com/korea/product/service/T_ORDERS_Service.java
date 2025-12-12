package com.korea.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.product.dto.T_ORDERDTO;
import com.korea.product.persistence.T_ORDERS_Repository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class T_ORDERS_Service {
	
	private final T_ORDERS_Repository orderRepository;
	
	//주문내역 조회하기
	public List<T_ORDERDTO> getAllOrderTotalPrices(){
		//select한 결과를 List 에 담는다
		List<Object[]> results = orderRepository.findAllOrderTotalPrices();
		//toListOrderDTO():List<Object> -> List<OrderDTO>
		return T_ORDERDTO.toListOrderDTO(results);
	}

}
