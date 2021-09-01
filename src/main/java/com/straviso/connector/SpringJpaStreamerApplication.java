package com.straviso.connector;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.speedment.jpastreamer.application.JPAStreamer;

@SpringBootApplication
public class SpringJpaStreamerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaStreamerApplication.class, args);
	}


	@Autowired
	private EntityManager entityManage;

	@Bean
	public JPAStreamer getStreamer() {
		return JPAStreamer.of(entityManage.getEntityManagerFactory());
	}

}
