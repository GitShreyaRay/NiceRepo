package com.nice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableJpaRepositories("com.nice.repository")
@EntityScan ("com.nice.entity")
@ComponentScan(basePackages = {"com.nice"} )
@EnableWebMvc
@EnableAutoConfiguration
@SpringBootApplication
public class NiceCrsRestApiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiceCrsRestApiBackendApplication.class, args);
		
	}

}

/*
 * ("com.nice.repository")
 * 
 * @EntityScan ("com.nice.entity")
 * 
 * @ComponentScan("com.nice.rest")
 */
