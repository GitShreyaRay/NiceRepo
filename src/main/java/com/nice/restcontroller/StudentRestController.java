package com.nice.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nice.dao.GradeDetailsDTO;
import com.nice.entity.Student;
import com.nice.service.StudentCRSService;

@RestController
@RequestMapping("/crs/students")
public class StudentRestController {

	@Autowired
	private final StudentCRSService studentCRSService;
	private static final Logger log = LoggerFactory.getLogger(StudentRestController.class);

	public StudentRestController(StudentCRSService studentCRSService) {
		this.studentCRSService = studentCRSService;
	}
	
	@GetMapping
	public List<Student> getAllStudents() {
		log.info("Inside get all students.");
		return studentCRSService.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public List<GradeDetailsDTO> getGradeDetails(@PathVariable Long id) {
		log.info("Inside view grades.");
		return studentCRSService.viewGrades(id);
	}
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public Student addStudent(@RequestBody Student newStudent) {
		log.info("Inside addStudent().");
		return studentCRSService.addStudent(newStudent);
	}
}
	
