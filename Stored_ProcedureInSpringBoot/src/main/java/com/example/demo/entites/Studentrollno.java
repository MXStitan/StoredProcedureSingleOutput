package com.example.demo.entites;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Studentrollno {
	private int rollNo;

	public Studentrollno() {
		super();
		// TODO Auto-generated constructor stub
	}

	@JsonCreator
	public Studentrollno( @JsonProperty("RollNo") int rollNo) {
		super();
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Studentrollno [rollNo=" + rollNo + "]";
	}

	
	

}
