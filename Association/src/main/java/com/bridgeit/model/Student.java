package com.bridgeit.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	private long studentId;
	private String studentName;
	private Set<Course> courses = new HashSet<Course>(0);

	public Student() {
	}
	
    @Id
    @GeneratedValue
    @Column(name="StudentId")
	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	@Column(name="Name")
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_COURSE", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "COURSE_ID") })
	public Set<Course> getCourses() {
		return courses;
	}

	
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	
}
