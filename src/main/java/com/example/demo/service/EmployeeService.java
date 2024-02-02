package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	Employee createEmployee(Employee employee);
	List<Employee> getEmployees();
	void save(Employee employee);
	void deleteEmployee(Integer employeeId);
}
