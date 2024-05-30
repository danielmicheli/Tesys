package com.tesys.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tesys.dto.DepartmentDto;
import com.tesys.model.Department;
import com.tesys.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	DepartmentMapperService departmentMapperService;

	@Override
	public List<DepartmentDto> getDepartments() {
		
		List<Department> departments = departmentRepository.findAll();
		
	
		return departments.stream()
				.map(departmentMapperService:: convertToDto)
				.collect(Collectors.toList());
	}

}
