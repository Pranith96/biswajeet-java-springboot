package com.employee.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.employee.dto.EmployeeRequestDto;
import com.employee.dto.EmployeeResponse;
import com.employee.dto.EmployeeResponseDto;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

import io.micrometer.common.util.StringUtils;

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

	@Override
	public List<EmployeeResponse> fetchAllEmployees() {
		List<Employee> results = employeeRepository.findAll();
		if (results == null || results.isEmpty()) {
			return new ArrayList<>();
		}
		List<EmployeeResponse> response = new ArrayList<>();
		for (Employee emp : results) {
			EmployeeResponse empResponse = new EmployeeResponse();
			empResponse.setId(emp.getId());
			empResponse.setEmpId(emp.getEmpId());
			empResponse.setName(emp.getName());
			empResponse.setAge(emp.getAge());
			empResponse.setGender(emp.getGender());
			empResponse.setMobileNumber(emp.getMobileNumber());
			empResponse.setStatus(emp.getStatus());
			response.add(empResponse);
		}
		return response;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// employeeRepository.findByEmpId(id);
		// employeeRepository.findByName(name);
		// employeeRepository.findByNameAndStatus(name,status);
		Optional<Employee> response = employeeRepository.findById(id);
		if (!response.isPresent()) {
			throw new RuntimeException("Data not found");
		}
//		EmployeeResponse empResponse = new EmployeeResponse();
//		empResponse.setId(response.get().getId());
//		empResponse.setEmpId(response.get().getEmpId());
//		empResponse.setName(response.get().getName());
//		empResponse.setAge(response.get().getAge());
//		empResponse.setGender(response.get().getGender());
//		empResponse.setMobileNumber(response.get().getMobileNumber());
//		empResponse.setStatus(response.get().getStatus());
		return response.get();
	}

	@Override
	public List<EmployeeResponse> fetchAllEmployeesByName(String name) {
		List<EmployeeResponse> response = new ArrayList<>();

		List<Employee> results = null;
		if (StringUtils.isBlank(name)) {
			results = employeeRepository.findAll();
			if (results == null || results.isEmpty()) {
				return new ArrayList<>();
			}
			response = mapEntityToDto(results, response);
			return response;
		}

		// results = employeeRepository.findAll().stream().filter(data ->
		// data.equals(name)).collect(Collectors.toList());

		results = employeeRepository.findByName(name);
		if (results == null || results.isEmpty()) {
			return new ArrayList<>();
		}
		response = mapEntityToDto(results, response);
		return response;
	}

	private List<EmployeeResponse> mapEntityToDto(List<Employee> employees, List<EmployeeResponse> response) {
		for (Employee emp : employees) {
			EmployeeResponse empResponse = new EmployeeResponse();
			empResponse.setId(emp.getId());
			empResponse.setEmpId(emp.getEmpId());
			empResponse.setName(emp.getName());
			empResponse.setAge(emp.getAge());
			empResponse.setGender(emp.getGender());
			empResponse.setMobileNumber(emp.getMobileNumber());
			empResponse.setStatus(emp.getStatus());
			response.add(empResponse);
		}
		return response;
	}

	@Override
	public EmployeeResponseDto deleteEmployeeById(Integer id) {
		Employee response = getEmployeeById(id);
		//employeeRepository.delete(response);
		employeeRepository.deleteById(id);
		EmployeeResponseDto responseDto = new EmployeeResponseDto();
		responseDto.setEmployeeId(String.valueOf(id));
		responseDto.setMessage("Deleted successfully");
		return responseDto;
	}

}
