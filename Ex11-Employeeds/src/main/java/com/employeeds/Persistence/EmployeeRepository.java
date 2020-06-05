package com.employeeds.Persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employeeds.Domain.Employee;
import com.employeeds.Domain.Role;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
		
	@Query("SELECT e from Employee e where e.role = :role")
	List<Employee> findAllByRole(@Param("role") Role role);
	
}