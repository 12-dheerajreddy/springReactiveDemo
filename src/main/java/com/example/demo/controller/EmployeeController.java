package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
    private	EmployeeRepo empRepo;
	
	@GetMapping(name="/find/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Employee> getbyId(@PathVariable("id")int id ){
		return empRepo.findById(id);
		
	}
	
}
