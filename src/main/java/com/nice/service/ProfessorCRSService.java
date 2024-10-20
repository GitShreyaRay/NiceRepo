package com.nice.service;

import java.util.List;

import com.nice.entity.Course;
import com.nice.entity.Grade;

public interface ProfessorCRSService {
	
	public Grade addGrades(Grade grade);
	public List<Course> viewCourses(Long studentId);

}
