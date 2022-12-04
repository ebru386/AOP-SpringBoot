package com.springBootAOP.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootAOP.annotation.CustomAnnotation;
import com.springBootAOP.business.abstracts.EmployeeService;
import com.springBootAOP.business.requests.CreateEmployeeRequest;
import com.springBootAOP.business.responses.CreateEmployeeResponse;
import com.springBootAOP.business.responses.GetAllEmployeeResponse;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeController {


    EmployeeService employeeService;
    
    @CustomAnnotation
    @GetMapping
    List<GetAllEmployeeResponse> getAll(){
    	return employeeService.getAll();
    }
    
    @CustomAnnotation
    @PostMapping
    CreateEmployeeResponse add(@RequestBody CreateEmployeeRequest createEmployeeRequest) {
    	return employeeService.add(createEmployeeRequest);
    }


}