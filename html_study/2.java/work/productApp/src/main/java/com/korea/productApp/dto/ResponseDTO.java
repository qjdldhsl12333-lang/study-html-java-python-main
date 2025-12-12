package com.korea.productApp.dto;

import java.util.List;

import lombok.Data;

@Data
public class ResponseDTO<t> {
		private String error;
		private List<t> data;
}
