package com.springBootAOP.business.concretes;

import java.util.ArrayList;
import java.util.List;

import com.springBootAOP.business.abstracts.EmployeeService;
import com.springBootAOP.business.requests.CreateEmployeeRequest;
import com.springBootAOP.business.responses.CreateEmployeeResponse;
import com.springBootAOP.business.responses.GetAllEmployeeResponse;
import com.springBootAOP.dataAccess.abstracts.EmployeeRepository;
import com.springBootAOP.entities.Employee;

public class EmployeeManager implements EmployeeService {
	EmployeeRepository employeeRepository;

	@Override
	public List<GetAllEmployeeResponse> getAll() {
		List<Employee> employee=employeeRepository.findAll();
        List<GetAllEmployeeResponse> responses=new ArrayList<>();
        for (Employee p:employee) {
            GetAllEmployeeResponse item=new GetAllEmployeeResponse();
            item.setId(p.getId());
            responses.add(item);
        }
        return responses;
	}

	@Override
	public CreateEmployeeResponse add(CreateEmployeeRequest createEmployeeRequest) {
		Employee employee=new Employee();
        employeeRepository.save(employee);

        CreateEmployeeResponse response=new CreateEmployeeResponse();
        response.setId(employee.getId());

        return response;
	}

}
