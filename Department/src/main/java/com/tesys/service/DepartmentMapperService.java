package com.tesys.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tesys.dto.DepartmentDto;
import com.tesys.model.Department;

@Service
public class DepartmentMapperService {
	
	@Autowired
	 private ModelMapper modelMapper;

    public DepartmentDto convertToDto(Department department) {
        return modelMapper.map(department, DepartmentDto.class);
    }

    public Department convertToEntity(DepartmentDto departmentDto) {
        return modelMapper.map(departmentDto, Department.class);
    }
	
}
