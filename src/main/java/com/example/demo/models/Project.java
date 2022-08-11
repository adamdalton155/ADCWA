package com.example.demo.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	public Project() {
		
	}
	
	public Project(int id, String pid, String name, int budget, List<Employee> employees) {
		super();
		this.id = id;
		this.pid = pid;
		this.name = name;
		this.budget = budget;
		this.employees = employees;
	}
	
	
	@Id		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pid;
	private String name;
	
	private int budget;
	@ManyToMany(mappedBy = "projects", cascade = CascadeType.REMOVE)
	private List<Employee> employees;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
