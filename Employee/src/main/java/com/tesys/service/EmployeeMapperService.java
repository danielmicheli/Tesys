package com.tesys.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tesys.dto.EmployeeDto;
import com.tesys.model.Employee;

@Service
public class EmployeeMapperService {

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeDto convertToDto(Employee employee) {
        return modelMapper.map(employee, EmployeeDto.class);
    }

    public Employee convertToEntity(EmployeeDto employeeDto) {
        return modelMapper.map(employeeDto, Employee.class);
    }
}

