package com.nice.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "courseregistration")
public class CourseRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseRegistrationId;
	private String courseId;
	@Column(name = "student_id")
	private Long studentId;

	public Long getCourseRegistrationId() {
		return courseRegistrationId;
	}

	public void setCourseRegistrationId(Long courseRegistrationId) {
		this.courseRegistrationId = courseRegistrationId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseName) {
		this.courseId = courseName;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id", referencedColumnName = "student_id", insertable=false, updatable=false)
	private Student student;

	@Override
	public String toString() {
		return "CourseRegistration [courseRegistrationId=" + courseRegistrationId + ", courseId=" + courseId
				+ ", studentId=" + studentId + "]";
	}

}
