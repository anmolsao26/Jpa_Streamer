package com.straviso.connector.serviceImpl;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.speedment.jpastreamer.application.*;
import com.straviso.connector.controller.Customer$;
import com.straviso.connector.controller.Customer;
import com.straviso.connector.dao.CustomerRepository;
import com.straviso.connector.dao.CustomerStreamer;
import com.straviso.connector.dto.ResponseDto;

@Service
public class CustomerSeviceImpl {

	@Autowired
	CustomerRepository customerRepo;

	@Autowired
	private JPAStreamer jpaStreamer;

	public ResponseDto saveEntity(Customer request) {
		ResponseDto response = new ResponseDto();
		request.setCreatedDate(LocalDateTime.now());
		customerRepo.save(request);
		response.setStatus("Success");
		response.setMessage("data saved to DB");
		return response;
	}

	public ResponseDto fethAllCustomer() {
		ResponseDto response = new ResponseDto();
		response.setStatus("Success");
		response.setMessage("fetch All details");
		response.setResponseData(jpaStreamer.stream(Customer.class).collect(Collectors.toList()));
		return response;
	}

}
