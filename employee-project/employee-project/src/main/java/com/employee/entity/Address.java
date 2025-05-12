package com.employee.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aId;
	private String plotNo;
	private String locality;
	private String city;
	private String state;

	private Integer employeeId;

//	public Integer getEmployeeId() {
//		return employeeId;
//	}
//
//	public void setEmployeeId(Integer employeeId) {
//		this.employeeId = employeeId;
//	}
//
//	public Integer getaId() {
//		return aId;
//	}
//
//	public void setaId(Integer aId) {
//		this.aId = aId;
//	}
//
//	public String getPlotNo() {
//		return plotNo;
//	}
//
//	public void setPlotNo(String plotNo) {
//		this.plotNo = plotNo;
//	}
//
//	public String getLocality() {
//		return locality;
//	}
//
//	public void setLocality(String locality) {
//		this.locality = locality;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}

}
