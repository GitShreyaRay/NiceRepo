package com.nice.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Grade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long resultId;
	private Long courseId;
	@Column(name="student_id")
	private Long studentId;
	private String grade;
	public Long getResultId() {
		return resultId;
	}
	public void setResultId(Long resultId) {
		this.resultId = resultId;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id", referencedColumnName = "student_id", insertable=false, updatable=false)
	private Student student;
	
	@Override
	public String toString() {
		return "Grade [resultId=" + resultId + ", courseId=" + courseId + ", studentId=" + studentId + ", grade="
				+ grade + "]";
	}


}
