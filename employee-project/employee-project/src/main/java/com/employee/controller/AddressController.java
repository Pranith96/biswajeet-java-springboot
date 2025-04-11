package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.AddressRequest;
import com.employee.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	AddressService addressService;

	@PostMapping("/save/{employeeId}")
	public ResponseEntity<String> createAddress(@RequestBody AddressRequest request,
			@PathVariable("employeeId") Integer employeeId) {
		try {
			String response = addressService.createAddress(request, employeeId);
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} catch (Exception ex) {
			System.out.println("Failed to save address records:" + ex.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save Address details");
		}
	}
	
	//fetch address record by id
	//fetch employee adress records 
	//city name list of employee records
	// city names fectch list of address
	// upadte address records 
	// delete address records
}
