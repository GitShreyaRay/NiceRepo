package com.nice.service;

import org.springframework.stereotype.Service;

import com.nice.dao.ReportCard;
import com.nice.entity.Course;
import com.nice.entity.Professor;

@Service
public interface AdminCRSService {
	
	public ReportCard generateReportCard(Long studentId);
	public Professor addProfessor(Professor professor);
	public Boolean approveStudentRegistration(Long studentId);
	public Course addCourse(Course course);
	public Course RemoveCourse(Long courseId);


}