package com.employee.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByName(String name);

//	@Query("Select e from Employee e where e.name=:name")
//	List<Employee> getByName(String name);

//	@Query("Select e from Employee e where e.name=:name and e.age = :age")
//	List<Employee> getByNameAndAge(String age, String name);

//	@Query("Select e from Employee e where e.name=?1")
//	List<Employee> getByName(String name);

	@Query(value = "Select * from employee_table where emp_name=:name ", nativeQuery = true)
	List<Employee> getByName(String name);

	//Page<Employee> findByName(Pageable page);

//	@Query("Update Employee e set e.status=:status where e.id=:id")
//	void updateStatus(Integer id, String status);

	// Optional<Employee> findByEmpId(Integer id);
}
