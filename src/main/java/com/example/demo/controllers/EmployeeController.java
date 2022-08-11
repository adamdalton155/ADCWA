package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.services.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService es;
	
	@GetMapping("/getEmployees")
	public Iterable<Employee> getAllEmployees(){
		return es.findAll();
	}

}
