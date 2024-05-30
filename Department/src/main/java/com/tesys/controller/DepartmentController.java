package com.tesys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesys.service.DepartmentService;
import com.tesys.dto.DepartmentDto;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
    
    @Autowired
    DepartmentService departmentService;
    
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DepartmentDto> getDepartments() {
        return departmentService.getDepartments();
    }
}
