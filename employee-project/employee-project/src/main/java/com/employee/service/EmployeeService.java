package com.employee.service;

import com.employee.dto.EmployeeRequestDto;
import com.employee.dto.EmployeeResponseDto;

public interface EmployeeService {

	EmployeeResponseDto registerEmployee(EmployeeRequestDto employeeRequest);

}
