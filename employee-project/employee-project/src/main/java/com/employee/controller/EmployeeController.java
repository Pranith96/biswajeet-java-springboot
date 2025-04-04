package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeRequestDto;
import com.employee.dto.EmployeeResponse;
import com.employee.dto.EmployeeResponseDto;
import com.employee.entity.Employee;
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
	
	@GetMapping("/fetch-all")
	public ResponseEntity<List<EmployeeResponse>> fetchAllEmployees() {
		List<EmployeeResponse> response = employeeService.fetchAllEmployees();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id) {
		Employee response = employeeService.getEmployeeById(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@GetMapping("/fetch")
	public ResponseEntity<Employee> getEmployee(@RequestParam(value = "id") Integer id) {
		Employee response = employeeService.getEmployeeById(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}