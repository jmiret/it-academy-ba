package com.employeeds.Domain;

public class EmployeeNotFoundException extends RuntimeException {
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 5535677700117936415L;

	public EmployeeNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
	

}
