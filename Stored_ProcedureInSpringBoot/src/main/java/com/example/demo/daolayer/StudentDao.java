package com.example.demo.daolayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Studentrollno;
import com.example.demo.entites.Student;

//import com.customer.entities.CustomerDetails;

@Repository
public class StudentDao  {
	
	@Autowired
	private EntityManager eManager;
	
	@SuppressWarnings("unchecked")
	public List<Student> getCustomerDetail(int rollno) {
		StoredProcedureQuery query = eManager.createStoredProcedureQuery("Getprogressreport","Student")
				.registerStoredProcedureParameter("RollNo", Integer.class, ParameterMode.IN)
				.setParameter("RollNo", rollno);
		query.execute();
		return query.getResultList();
	}
	
}
