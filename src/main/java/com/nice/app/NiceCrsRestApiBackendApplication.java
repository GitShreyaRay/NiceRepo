package com.nice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class NiceCrsRestApiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiceCrsRestApiBackendApplication.class, args);
		
	}

}
