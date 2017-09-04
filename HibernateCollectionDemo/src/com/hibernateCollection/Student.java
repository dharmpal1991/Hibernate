package com.hibernateCollection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_DETAILS")
public class Student {
	
	@Id
	@Column(name = "STUDENT_ID")
	private int studentId;
	
	@Column(name = "STUDENT_NAME")
	private String studentName;
	
	@Column(name = "COLLEGE_ID")
	private int collegeId;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public Student(int studentId, String studentName, int collegeId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.collegeId = collegeId;
	}
}
