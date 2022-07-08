package com.example.demo.entites;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

//import com.customer.entities.CustomerDetails;
@Entity
@Table
@SqlResultSetMapping(name = "Student" , classes = @ConstructorResult(targetClass = Student.class ,columns = {
		@ColumnResult(name = "RollNo"  , type = Integer.class),
		@ColumnResult(name = "Name" , type = String.class),
		@ColumnResult(name = "Subject" , type = String.class),
		@ColumnResult(name = "Marks" , type = Integer.class)
}))

public class Student {
	@Id
	private int rollno;
	private String name;
	private String subject;
	private int marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, String subject, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
	}
	

}
