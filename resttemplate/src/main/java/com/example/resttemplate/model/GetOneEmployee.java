package com.example.resttemplate.model;

import java.util.List;

public class GetOneEmployee {
	private String status;
	private Employee data;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Employee getData() {
		return data;
	}
	public void setData(Employee data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "GetOneEmployee [status=" + status + ", data=" + data + "]";
	}
	
}
