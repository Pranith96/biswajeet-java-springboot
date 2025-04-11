package com.employee.dto;

import com.employee.entity.Gender;

public class EmployeeResponse {

	private Integer id;
	private String name;
	private String mobileNumber;
	private Integer age;
	private String empId;
	private Gender gender;
	private String status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EmployeeResponse(Integer id, String name, String mobileNumber, Integer age, String empId, Gender gender,
			String status) {
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.empId = empId;
		this.gender = gender;
		this.status = status;
	}

	public EmployeeResponse() {
	}

}
