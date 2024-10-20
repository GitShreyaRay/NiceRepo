package com.nice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nice.entity.Course;
import com.nice.entity.Grade;

@Service
public interface ProfessorCRSService {
	
	public Grade addGrades(Grade grade);
	public List<Course> viewCourses(Long studentId);

}
