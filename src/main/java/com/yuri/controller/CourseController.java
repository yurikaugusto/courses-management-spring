package com.yuri.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yuri.model.Course;
import com.yuri.repository.CourseRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")// endpoint
@AllArgsConstructor// cria um construtor para a classe CourseController com todos os atributos 
// que possuir, dessa forma garante a injeção de dependências por construtor
public class CourseController {
	
	private final CourseRepository courseRepository;
	
	@GetMapping// == @RequestMapping(method = RequestMethod.GET)
	public List<Course> list(){
		return courseRepository.findAll();
	}
	
}
