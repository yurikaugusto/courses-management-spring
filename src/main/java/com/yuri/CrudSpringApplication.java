package com.yuri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringApplication {

	//método responsável por fazer o boot (start) da aplicação java com Spring
	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

}
