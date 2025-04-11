package com.employee.service;

import com.employee.dto.AddressRequest;

public interface AddressService {

	String createAddress(AddressRequest request, Integer employeeId) throws Exception;

}
