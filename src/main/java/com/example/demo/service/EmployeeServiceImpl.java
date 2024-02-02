package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
	
	private final EmployeeRepository employeeRepo;

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	/*@Override
	public Employee findEmployeeById(Integer employeeId) {
		// TODO Auto-generated method stub
		//return employeeRepo.findById(employeeId).get();
		return employeeRepo.getReferenceById(employeeId);
	}*/

	/*@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}*/

	@Override
	public void deleteEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(employeeId);
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);
	}

}
