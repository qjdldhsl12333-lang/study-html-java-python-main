package com.korea.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//Product 테이블이랑 PK, FK로 연결하려고 한다.
//


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Order")
public class OrderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@ManyToOne //다대일 관계를 설정 (하나의 ProductEntity가 여러개의 OrderEntity에 의해 참조될수 있다.)
	@JoinColumn(name = "productId", nullable = false) //외래키로 사용할 컬럼의 정보를 지정
	private ProductEntity product;
	
	private int productCount;
	
	private String orderDate;
	
	

}
