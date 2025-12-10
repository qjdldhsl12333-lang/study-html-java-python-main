package com.korea.product.dto;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
	
	String name;
	int inven;
	int price;
	@CreationTimestamp
	String LocalDateTime;
	@UpdateTimestamp
	String LocalDatetime;
	

}
