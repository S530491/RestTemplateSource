package com.example.resttemplate.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.resttemplate.model.CreateRequest;
import com.example.resttemplate.model.CreateRequestResponse;
import com.example.resttemplate.model.Employee;
import com.example.resttemplate.model.GetAllEmployees;
import com.example.resttemplate.model.GetOneEmployee;
import com.example.resttemplate.service.EmployeeService;
@RestController
public class SourceRestController {

	@Autowired
	private EmployeeService service;
	@GetMapping("/AllEmployees")
	public GetAllEmployees getAll(){
		return service.getall();
	}
	@GetMapping("/OneEmployee/{id}")
	public GetOneEmployee getAl(@PathVariable String id){
		return service.getOne(id);
	}
	
	@PostMapping("/postEmployee")
	public CreateRequestResponse postemployee(@RequestBody CreateRequest req) {
		
		return service.postt(req);
	}
	
	
}
