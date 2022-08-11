package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
