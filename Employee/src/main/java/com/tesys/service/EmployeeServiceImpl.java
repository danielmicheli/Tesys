package com.tesys.service;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tesys.dto.EmployeeDto;
import com.tesys.model.Employee;
import com.tesys.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	EmployeeMapperService employeeMapperService;
	

	@Override
	public List<EmployeeDto> getEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		
		return employees.stream()
				.map(employeeMapperService:: convertToDto)
				.collect(Collectors.toList());
	}
	
	

}
