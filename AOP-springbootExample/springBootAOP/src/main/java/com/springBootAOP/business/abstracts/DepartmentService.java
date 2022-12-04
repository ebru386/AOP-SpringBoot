package com.springBootAOP.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springBootAOP.business.requests.CreateDepartmentRequest;
import com.springBootAOP.business.responses.CreateDepartmentResponse;
import com.springBootAOP.business.responses.GetAllDepartmentResponse;

@Service
public interface DepartmentService {

	List<GetAllDepartmentResponse> getAll ();
	CreateDepartmentResponse add (CreateDepartmentRequest createDepartmentRequest);
}