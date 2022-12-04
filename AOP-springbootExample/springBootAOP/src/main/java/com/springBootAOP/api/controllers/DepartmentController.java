package com.springBootAOP.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootAOP.annotation.CustomAnnotation;
import com.springBootAOP.business.abstracts.DepartmentService;
import com.springBootAOP.business.requests.CreateDepartmentRequest;
import com.springBootAOP.business.responses.CreateDepartmentResponse;
import com.springBootAOP.business.responses.GetAllDepartmentResponse;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

	DepartmentService departmentService;

	@CustomAnnotation
	@GetMapping
	List<GetAllDepartmentResponse> getAll() {
		return departmentService.getAll();
	}

	@CustomAnnotation
	@PostMapping
	CreateDepartmentResponse add(@RequestBody CreateDepartmentRequest createDepartmentRequest) {
		return departmentService.add(createDepartmentRequest);
	}
}