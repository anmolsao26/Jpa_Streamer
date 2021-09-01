package com.straviso.connector.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.straviso.connector.controller.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
