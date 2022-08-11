package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}
