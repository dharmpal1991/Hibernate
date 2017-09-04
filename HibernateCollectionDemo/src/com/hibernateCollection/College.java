package com.hibernateCollection;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

@Entity
@Table(name = "COLLEGE")
public class College {
	
	@Id
	@Column(name = "COLLEGE_ID")
	private int collegeId;
	
	@Column(name = "COLLEGE_NAME")
	private String collegeName;
	
	@CollectionOfElements
	@JoinTable(name = "STUDENT_DETAILS",joinColumns = @JoinColumn(name = "COLLEGE_ID"))
	@Column(name = "STUDENT")
	private Set<String> student;
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Set<String> getStudent() {
		return student;
	}
	public void setStudent(Set<String> student) {
		this.student = student;
	}
	public College(int collegeId, String collegeName) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
	}
	
}
