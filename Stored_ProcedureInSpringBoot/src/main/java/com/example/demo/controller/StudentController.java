package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Response;

import com.example.demo.entites.Studentrollno;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	

	@PostMapping("/customer")
	public Response getCustomerDetail(@RequestBody Studentrollno rollNo)
	{
		
		return this.studentService.getCustomerDetail(rollNo.getRollNo());
	}

}
