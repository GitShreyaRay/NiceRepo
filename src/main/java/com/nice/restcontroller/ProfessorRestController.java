package com.nice.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nice.entity.Grade;
import com.nice.service.ProfessorCRSService;

@RestController
@RequestMapping("/crs/professor")
public class ProfessorRestController {

	@Autowired
	private final ProfessorCRSService professorCRSService;
	private static final Logger log = LoggerFactory.getLogger(StudentRestController.class);

	public ProfessorRestController(ProfessorCRSService professorCRSService) {
		this.professorCRSService = professorCRSService;
	}
	
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, value="/addgrades")
	public Grade addGrades(@RequestBody Grade grade) {
		log.info("Inside addGrades().");
		return professorCRSService.addGrades(grade);
	}


}
