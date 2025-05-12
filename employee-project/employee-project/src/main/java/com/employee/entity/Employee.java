package com.employee.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@EqualsAndHashCode
//@Getter
//@Setter
@Entity
@Table(name = "employee_table")
@DynamicInsert
@DynamicUpdate
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "emp_name")
	private String name;
	@Column(name = "mobile_number") // , length = 10, nullable = false, updatable = false)
	private String mobileNumber;
	@Column(name = "emp_age")
	private Integer age;
	@Column(name = "emp_id", unique = true)
	private String empId;
	@Column(name = "gender")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Column(name = "status")
	private String status;
	@CreationTimestamp
	private LocalDateTime createdAt;
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getMobileNumber() {
//		return mobileNumber;
//	}
//
//	public void setMobileNumber(String mobileNumber) {
//		this.mobileNumber = mobileNumber;
//	}
//
//	public Integer getAge() {
//		return age;
//	}
//
//	public void setAge(Integer age) {
//		this.age = age;
//	}
//
//	public String getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(String empId) {
//		this.empId = empId;
//	}
//
//	public Gender getGender() {
//		return gender;
//	}
//
//	public void setGender(Gender gender) {
//		this.gender = gender;
//	}
//
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
//
//	public LocalDateTime getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(LocalDateTime createdAt) {
//		this.createdAt = createdAt;
//	}
//
//	public LocalDateTime getUpdatedAt() {
//		return updatedAt;
//	}
//
//	public void setUpdatedAt(LocalDateTime updatedAt) {
//		this.updatedAt = updatedAt;
//	}

//	public Employee(Integer id, String name, String mobileNumber, Integer age, String empId, Gender gender,
//			String status, LocalDateTime createdAt, LocalDateTime updatedAt) {
//		this.id = id;
//		this.name = name;
//		this.mobileNumber = mobileNumber;
//		this.age = age;
//		this.empId = empId;
//		this.gender = gender;
//		this.status = status;
//		this.createdAt = createdAt;
//		this.updatedAt = updatedAt;
//	}
//
//	public Employee() {
//	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", age=" + age + ", empId="
//				+ empId + ", gender=" + gender + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt="
//				+ updatedAt + "]";
//	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(age, createdAt, empId, gender, id, mobileNumber, name, status, updatedAt);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return Objects.equals(age, other.age) && Objects.equals(createdAt, other.createdAt)
//				&& Objects.equals(empId, other.empId) && gender == other.gender && Objects.equals(id, other.id)
//				&& Objects.equals(mobileNumber, other.mobileNumber) && Objects.equals(name, other.name)
//				&& Objects.equals(status, other.status) && Objects.equals(updatedAt, other.updatedAt);
//	}

}
