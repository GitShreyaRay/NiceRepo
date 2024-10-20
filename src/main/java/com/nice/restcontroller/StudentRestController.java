package com.nice.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nice.entity.Student;
import com.nice.repository.StudentCRSJPARepository;

@RestController
@RequestMapping("/crs/students")
public class StudentRestController {

	@Autowired
	private final StudentCRSJPARepository studentRepository;
	private static final Logger log = LoggerFactory.getLogger(StudentRestController.class);

	public StudentRestController(StudentCRSJPARepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@GetMapping
	public List<Student> getAllStudents() {
		log.info("Inside get all students.");
		return studentRepository.findAll();
	}
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public Student addStudent(@RequestBody Student newStudent) {
		log.info("Inside addStudent().");
		return studentRepository.save(newStudent);
	}

	@GetMapping("/{id}") 
	public Student getStudentById(@PathVariable Long id) {
		log.info("Inside get getByStudentId().");
		return studentRepository.findById(id).orElse(null);
	}
	
	@PutMapping("/{id}") 
	public Student updateStudentById(@RequestBody Student updatedStudent,@PathVariable Long id) {
		log.info("Inside updateStudentById().");
	
		return studentRepository.findById(id)
				.map(student -> {
					student.setFirstName(updatedStudent.getFirstName());
					student.setLastName(updatedStudent.getLastName());
					student.setEmail(updatedStudent.getEmail());
					return studentRepository.save(student);

				}).orElseGet(()-> {
					return studentRepository.save(updatedStudent);
				});
	}
	
	@DeleteMapping("/{id}") 
	public void deleteStudentById(@PathVariable Long id) {
		log.info("Inside get getByStudentId().");
		studentRepository.deleteById(id);
	}

}
