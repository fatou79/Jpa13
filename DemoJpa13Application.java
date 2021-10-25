package com.fatou.demoJpa13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatou.demoJpa13.dao.Person;
import com.fatou.demoJpa13.dao.PersonJdbcDao;

@SpringBootApplication
public class DemoJpa13Application implements CommandLineRunner {
	
	private Logger fatou = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao diagne;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoJpa13Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		fatou.info("All users -> {}", diagne.findAll());
		fatou.info("User id 10001 -> {}", diagne.findById(10001));
		
	}
	

	}


