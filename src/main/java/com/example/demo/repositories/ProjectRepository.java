package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer> {

}
