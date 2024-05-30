package com.tesys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesys.dto.EmployeeDto;
import com.tesys.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeDto> getAllEmployee(){
        return employeeService.getEmployees();
    }
}
