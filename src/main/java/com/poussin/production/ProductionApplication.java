package com.poussin.production;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.poussin.production.rest")
public class ProductionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductionApplication.class, args);
	}

}

