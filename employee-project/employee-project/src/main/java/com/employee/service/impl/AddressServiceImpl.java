package com.employee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.employee.dto.AddressRequest;
import com.employee.entity.Address;
import com.employee.entity.Employee;
import com.employee.repository.AddressRepository;
import com.employee.service.AddressService;
import com.employee.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addressRepository;

	@Qualifier(value = "service1")
	@Autowired
	EmployeeService employeeService;

	@Override
	public String createAddress(AddressRequest request, Integer employeeId) throws Exception {
		try {
			Employee response = employeeService.getEmployeeById(employeeId);
//			Address address = new Address();
//			address.setCity(request.getCity());
//			address.setEmployeeId(response.getId());
//			address.setLocality(request.getLocality());
//			address.setPlotNo(request.getPlotNo());
//			address.setState(request.getState());
			
			Address address = Address.builder()
					.city(request.getCity())
					.employeeId(employeeId)
					.locality(request.getLocality())
					.plotNo(request.getPlotNo())
					.state(request.getState())
					.build();
			log.info("inside address creation");
			Address addressResponse = addressRepository.save(address);
			if (addressResponse == null) {
				throw new Exception("Failed to save address records");
			}
			return "Saved successfully";
		} catch (Exception ex) {
			log.error("Exception occured while fetching employee records: " , ex);
			throw new Exception("Failed to save address records");
		}
	}
}
