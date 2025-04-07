package com.employee.service;

import java.util.List;

import com.employee.dto.EmployeeRequestDto;
import com.employee.dto.EmployeeResponse;
import com.employee.dto.EmployeeResponseDto;
import com.employee.entity.Employee;

public interface EmployeeService {

	EmployeeResponseDto registerEmployee(EmployeeRequestDto employeeRequest);

	List<EmployeeResponse> fetchAllEmployees();

	Employee getEmployeeById(Integer id);

	List<EmployeeResponse> fetchAllEmployeesByName(String name);

	EmployeeResponseDto deleteEmployeeById(Integer id);

}
