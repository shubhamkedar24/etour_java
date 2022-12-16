package com.indiatour.etour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.indiatour.etour.services.Emailservice;

//@SpringBootApplication
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class EtourApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(EtourApplication.class, args);
	}
	
	
}

