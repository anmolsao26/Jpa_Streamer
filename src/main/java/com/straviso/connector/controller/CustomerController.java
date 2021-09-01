package com.straviso.connector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.straviso.connector.dto.ResponseDto;
import com.straviso.connector.serviceImpl.CustomerSeviceImpl;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private CustomerSeviceImpl customerService;

	@PostMapping("/save")
	public ResponseEntity<ResponseDto> saveEntity(@RequestBody Customer request) {
		ResponseDto response = customerService.saveEntity(request);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/fethAllCustomer")
	public ResponseEntity<ResponseDto> fethAllCustomer() {
		ResponseDto response = customerService.fethAllCustomer();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
