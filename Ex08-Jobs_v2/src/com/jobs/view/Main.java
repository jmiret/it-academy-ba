package com.jobs.view;

import java.util.List;

import com.jobs.application.JobsController;
import com.jobs.domain.AbsStaffMember;

public class Main {
	
	private static JobsController controller = new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666", "Medical volunteer");
		controller.createManagerEmployee("Pedro Employee", "Dirección molona 2", "665226666", 80.0);
		
		controller.payAllEmployeers();
		
		List<AbsStaffMember> allEmployees = controller.getAllEmployees();
		
		System.out.println("EMPLOYEES: \n");
		
		for (AbsStaffMember employee : allEmployees ) {
			System.out.println(" - " + employee.toString() + " \n");
		}	
		
	}

}
