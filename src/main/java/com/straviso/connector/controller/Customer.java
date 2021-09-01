package com.straviso.connector.controller;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String employeName;
	private String employeSurname;
	private double employeSalary;
	private int age;
	private LocalDateTime createdDate;
	private LocalDateTime updateDate;

}
