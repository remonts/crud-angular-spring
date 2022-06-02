package com.renan.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.renan.crudspring.model.Course;
import com.renan.crudspring.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor 
public class CourseController {
	
	private final CourseRepository courseRepository;
	
	public CourseController(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@GetMapping
	public @ResponseBody List<Course> list() {
		return courseRepository.findAll();
	}
	
	@PostMapping
	public void create() {
		
	}
}
