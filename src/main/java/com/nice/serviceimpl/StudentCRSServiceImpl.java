package com.nice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nice.dao.CourseDetailsDTO;
import com.nice.dao.GradeDetailsDTO;
import com.nice.entity.Course;
import com.nice.entity.Student;
import com.nice.repository.StudentCRSJPARepository;
import com.nice.service.StudentCRSService;

/**
 * Service Interface to include all Student related services
 */
@Service
public class StudentCRSServiceImpl implements StudentCRSService {
	
	@Autowired
	private StudentCRSJPARepository studentCRSJPARepository;
	
	//private final ReportRepository reportRepository;
	
	public List<Student> getAllStudents() {
		return studentCRSJPARepository.findAll();
	}
	
	public Student addStudent(Student newStudent) {
		return studentCRSJPARepository.save(newStudent);
	}
	
	public Student getStudentById(Long id) {
		return null;
	}
	
	public Student updateStudentById(Student updatedStudent, Long id) {
		return null;
	}
	
	public void deleteStudentById(Long id) {
	}

	@Override
	public void registerCourse(CourseDetailsDTO courseDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> viewCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course addCourse(Course newCourse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dropCourse(Long courseId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<GradeDetailsDTO> viewGrades(Long studentId) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	//Additional services


	


}
