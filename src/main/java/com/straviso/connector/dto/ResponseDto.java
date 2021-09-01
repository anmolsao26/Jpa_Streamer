package com.straviso.connector.dto;

import lombok.Data;

@Data
public class ResponseDto {

	private String message;
	private String status;
	private Object responseData;
	
}
