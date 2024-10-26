package com.nice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.nice.dao.CourseDetailsDTO;
import com.nice.dao.GradeDetailsDTO;
import com.nice.entity.Course;
import com.nice.entity.Student;

/**
 * Service Interface to include all Student related services
 */
@Service
public interface StudentCRSService {
	
	public List<Student> getAllStudents();
	
	public Student addStudent(Student newStudent);
	
	public Student getStudentById(Long id);
	
	public Student updateStudentById(Student updatedStudent, Long id);
	
	public void deleteStudentById(Long id);
	
	//Additional services
	public void registerCourse(CourseDetailsDTO courseDetails);
	public List<Course> viewCourses();
	public Course addCourse(Course newCourse);
	public void dropCourse(Long courseId);
	public  List<GradeDetailsDTO> viewGrades(Long studentId);

	


}
