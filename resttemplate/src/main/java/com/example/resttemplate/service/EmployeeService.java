package com.example.resttemplate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.resttemplate.model.CreateRequest;
import com.example.resttemplate.model.CreateRequestResponse;
import com.example.resttemplate.model.DataRequest;
import com.example.resttemplate.model.Employee;
import com.example.resttemplate.model.GetAllEmployees;
import com.example.resttemplate.model.GetOneEmployee;

@Service
public class EmployeeService {
	public static List<Employee> l=new ArrayList<Employee>();
	public EmployeeService() {
	Employee e=new Employee("1","Tiger Nixon","320800","61","");
	Employee e1=new Employee("2","Tiger Nixon1","320801","62","");
	Employee e2=new Employee("3","Tiger Nixon2","320802","63","");
	Employee e3=new Employee("4","Tiger Nixon3","320803","64","");
	Employee e4=new Employee("5","Tiger Nixon4","320804","65","");
	l.add(e);l.add(e1);l.add(e2);l.add(e3);l.add(e4);		
	}
	
	public GetAllEmployees getall(){
		GetAllEmployees g=new GetAllEmployees();
		g.setStatus("success");
		g.setData(l);
		return g;
	}
	public GetOneEmployee getOne(String id) {
		for(Employee k:l) {
			if(k.getId().equals(id)) {
				GetOneEmployee g=new GetOneEmployee();
				g.setStatus("success");
				g.setData(k);
				return g;
			}
		}
		return null;
	}
	public CreateRequestResponse postt(CreateRequest c) {
		Employee e=new Employee("6",c.getName(),c.getSalary(),c.getAge(),"");
		l.add(e);
		CreateRequestResponse r=new CreateRequestResponse();
				r.setStatus("success");
		r.setData(new DataRequest(c.getName(),c.getSalary(),c.getAge()));
		r.getData().setId(6);
		
		return r;
	}

}
