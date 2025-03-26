package com.employee.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeRequestDto;
import com.employee.dto.EmployeeResponseDto;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeResponseDto registerEmployee(EmployeeRequestDto employeeRequest) {

		Employee employee = new Employee();
		employee.setName(employeeRequest.getName());
		employee.setAge(employeeRequest.getAge());
		employee.setMobileNumber(employeeRequest.getMobileNumber());
		String employeeId = getRandomEmployeeId();
		employee.setEmpId(employeeId);
		employee.setGender(employeeRequest.getGender());
		employee.setStatus("ACTIVE");

		Employee response = employeeRepository.save(employee);
		EmployeeResponseDto responseDto = new EmployeeResponseDto();
		if (response == null) {
			responseDto.setEmployeeId(null);
			responseDto.setMessage("Failed to save employee records");
			return responseDto;
		}
		responseDto.setEmployeeId(response.getEmpId());
		responseDto.setMessage("Employee details saved");
		return responseDto;
	}

	private String getRandomEmployeeId() {
		Random random = new Random();
		int num = random.nextInt(1111, 9999);
		String employeeId = "abc" + num;
		return employeeId;
	}

}
