package com.nice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="semesterregistration")
public class SemesterRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long semesterId;
	private String semesterName;
	@Column(name = "student_id")
	private Long studentId;

	public Long getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id", referencedColumnName = "student_id", insertable=false, updatable=false)
	private Student student;

	@Override
	public String toString() {
		return "SemesterRegistration [semesterId=" + semesterId + ", semesterName=" + semesterName + ", studentId="
				+ studentId + ", student=" + student + "]";
	}

}
