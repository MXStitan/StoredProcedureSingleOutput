package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daolayer.StudentDao;
import com.example.demo.entites.Response;
import com.example.demo.entites.Studentrollno;
import com.example.demo.entites.Student;


@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao customerdao;

	@Override
	public Response getCustomerDetail(int rollno) {
		// TODO Auto-generated method stub		
		List<Student> list = customerdao.getCustomerDetail(rollno);
		Response response  = new Response(1 ,0 , "I" , "sucess" , list.get(0));
		return response;
	}

	
}