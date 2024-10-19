package com.nice.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nice.entity.Student;
import com.nice.repository.StudentRepository;

@RestController
@RequestMapping("/crs/students")
public class StudentController {

	private final StudentRepository studentRepository;
	private static final Logger log = LoggerFactory.getLogger(StudentController.class);

	public StudentController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@GetMapping // request mapping change
	public List<Student> getAllStudents() {
		log.info("Inside get all students.");
		return studentRepository.findAll();
	}

}
