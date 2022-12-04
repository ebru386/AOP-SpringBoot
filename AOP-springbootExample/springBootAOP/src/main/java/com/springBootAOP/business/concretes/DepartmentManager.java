package com.springBootAOP.business.concretes;

import java.util.ArrayList;
import java.util.List;

import com.springBootAOP.business.abstracts.DepartmentService;
import com.springBootAOP.business.requests.CreateDepartmentRequest;
import com.springBootAOP.business.responses.CreateDepartmentResponse;
import com.springBootAOP.business.responses.GetAllDepartmentResponse;
import com.springBootAOP.dataAccess.abstracts.DepartmentRepository;
import com.springBootAOP.entities.Department;

public class DepartmentManager implements DepartmentService{
	DepartmentRepository repository;
	@Override
	public List<GetAllDepartmentResponse> getAll() {
		List<Department> departments=repository.findAll();
        List<GetAllDepartmentResponse> responses=new ArrayList<>();
        for (Department d:departments) {
            GetAllDepartmentResponse item=new GetAllDepartmentResponse();
            item.setId(d.getId());
            item.setName(d.getName());
            responses.add(item);
        }
        return responses;
	}

	@Override
	public CreateDepartmentResponse add(CreateDepartmentRequest createDepartmentRequest) {
		Department department= new Department();
		department.setName(createDepartmentRequest.getName());
		repository.save(department);
		
		CreateDepartmentResponse response = new CreateDepartmentResponse();
		response.setId(department.getId());
		response.setName(department.getName());
		return response;
	}

}
