package com.springBootAOP.business.requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.springBootAOP.entities.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllDepartmentRequest {
	@NotNull
	@NotBlank
	private String name;
	@NotNull
	@NotBlank
	private Employee employeeId;

}
