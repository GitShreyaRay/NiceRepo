package com.nice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nice.entity.Course;
import com.nice.entity.Grade;
import com.nice.repository.GradeCRSJPARepository;
import com.nice.service.ProfessorCRSService;

@Service
public class ProfessorCRSServiceImpl implements ProfessorCRSService {
	
	@Autowired
	private GradeCRSJPARepository gradeCRSJPARepository;

	@Override
	public Grade addGrades(Grade grade) {
		
		return gradeCRSJPARepository.save(grade);
	}

	@Override
	public List<Course> viewCourses(Long studentId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
