package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeRequestDto;
import com.employee.dto.EmployeeResponseDto;
import com.employee.service.EmployeeService;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/register")
	public ResponseEntity<EmployeeResponseDto> registerEmployee(@RequestBody EmployeeRequestDto employeeRequest) {
		EmployeeResponseDto response = employeeService.registerEmployee(employeeRequest);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
}