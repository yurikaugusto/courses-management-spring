package com.yuri;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.yuri.model.Course;
import com.yuri.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	// método responsável por fazer o boot (start) da aplicação java com Spring
	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {// executado assim que a aplicação subir 
		return args -> {
			courseRepository.deleteAll();
			Course c = new Course();
			c.setName("Angular com Spring");
			c.setCategory("front-end");
			courseRepository.save(c);
		};
	}
}
