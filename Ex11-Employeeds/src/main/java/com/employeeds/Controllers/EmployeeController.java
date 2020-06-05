package com.employeeds.Controllers;

import com.employeeds.Domain.Employee;
import com.employeeds.Domain.EmployeeNotFoundException;
import com.employeeds.Domain.Role;
import com.employeeds.Persistence.EmployeeRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class EmployeeController {
	
	private final EmployeeRepository repository;

	public EmployeeController(EmployeeRepository repository) {
		super();
		this.repository = repository;
	}

	// Aggregate root
	
	@GetMapping("/employees")
	List<Employee> all() {
		
		return repository.findAll();
	}
	
	@GetMapping("/employeesByRole/{role}")
	List<Employee> allByRole(@PathVariable Role role) {
		return repository.findAllByRole(role);
	}
	
	@PostMapping("/employees")
	Employee newEmployee(@RequestBody Employee newEmployee) {
		newEmployee.setSalaryPerMonth(newEmployee.getRole().getSalary());
		
		return repository.save(newEmployee);
	}

	// Single item

	@GetMapping("/employees/{id}")
	Employee one(@PathVariable Long id) {
		
		return repository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException(id));
	}

	@PutMapping("/employees/{id}")
	Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

		return repository.findById(id).map(employee -> {
			employee.setName(newEmployee.getName());
			employee.setRole(newEmployee.getRole());
			employee.setSalaryPerMonth(newEmployee.getRole().getSalary());
			return repository.save(employee);
		}).orElseGet(() -> {
			newEmployee.setId(id);
			return repository.save(newEmployee);
		});
	}

	@DeleteMapping("/employees/{id}")
	void deleteEmployee(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
