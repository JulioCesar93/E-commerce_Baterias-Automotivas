package com.jcs.BateriaStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BateriaStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BateriaStoreApplication.class, args);
	}
}