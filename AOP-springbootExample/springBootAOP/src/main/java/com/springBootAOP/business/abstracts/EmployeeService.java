package com.springBootAOP.business.abstracts;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springBootAOP.business.requests.CreateEmployeeRequest;
import com.springBootAOP.business.responses.CreateEmployeeResponse;
import com.springBootAOP.business.responses.GetAllEmployeeResponse;

@Service
public interface EmployeeService {
	List<GetAllEmployeeResponse> getAll();
	CreateEmployeeResponse add(CreateEmployeeRequest createEmployeeRequest);
    
}