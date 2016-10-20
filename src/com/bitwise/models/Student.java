package com.bitwise.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Student {
	@Id
	@GeneratedValue(generator="newGenerator")
	@GenericGenerator(name="newGenerator" , strategy="foreign" , parameters ={@Parameter(name = "property", value = "student")})
	private int rollNo;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	private int mobileNo;
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="rollNo")
	public Student_Info getStudent_Info() {
		return student_Info;
	}
	public void setStudent_Info(Student_Info student_Info) {
		this.student_Info = student_Info;
	}
	private Student_Info student_Info;

}
