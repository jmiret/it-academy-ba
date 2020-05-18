package main;

import java.util.ArrayList;
import java.util.List;

import com.rockets.project.Thruster;
import com.rockets.project.Rocket;

import java.util.Scanner;

public class Fase_3 {

	public static Scanner speedDataEntry = new Scanner(System.in);
	public static Scanner powerDataEntry = new Scanner(System.in);
	public static List<Rocket> rockets = new ArrayList<Rocket>();
	
	public static void main(String[] args) {
		
		Rocket rocket1;
		Rocket rocket2;
		int[] maxPowersThrusterRocket1 = {10, 30, 80};
		int[] maxPowersThrusterRocket2 = {30, 40, 50, 50, 30, 10};
		Scanner rocketDataEntry = new Scanner(System.in);	
		int valRocketDataEntry = -1;
		
		rocket1 = new Rocket("32WESSDS");		
		
		createThrusters(rocket1, maxPowersThrusterRocket1);
		
		rockets.add(rocket1);
		
		rocket2 = new Rocket("LDSFJA32");
		
		createThrusters(rocket2, maxPowersThrusterRocket2);
		
		rockets.add(rocket2);
		
		showConsole(rockets, null);
		
		while (valRocketDataEntry != 0) {			
			System.out.println("Select a Rocket: ");
			System.out.println("Press key(1) Code: 32WESSDS or key(2) Code: LDSFJA32): ");
			valRocketDataEntry = rocketDataEntry.nextInt();
			
			switch (valRocketDataEntry) {
				case 0:
					exit();
					valRocketDataEntry = 0;
					break;
				case 1:
					System.out.println(rocket1.toString());
					valPowerDataEntry(rocket1);
					break;
				case 2:	
					System.out.println(rocket2.toString());
					valPowerDataEntry(rocket2);
					break;
				default:
					System.out.println("Invalid option.");
					showConsole(rockets, null);
			}		
		}
		
		powerDataEntry.close();
		rocketDataEntry.close();
		
	}
	
	// Thrusters are created and the corresponding powers are added
	public static void createThrusters(Rocket rocket, int[] maxPowers) {
		
		for (int i = 0; i < maxPowers.length; i++) {
			
			Thruster thruster = new Thruster(maxPowers[i], 0);
			
			rocket.addThruster(thruster);
			
		}
		
	}
	
	public static void showConsole(List<Rocket> rockets, Rocket rocketSel) {
		
		int i = 0;
		int j = 1;
		
		System.out.println	("");
		System.out.println	("*********** Rockets ****************** Thrusters *************");		
		System.out.println	("                               [ 1] [ 2] [ 3] [ 4] [ 5] [ 6]  ");
		System.out.println  (" key(0) Exit");
		System.out.println	("");	
			for (Rocket rocket: rockets) {
				System.out.print	(" key(" + j + ") ");
				System.out.println	(rocket.toString());
				System.out.println	("");
				System.out.print    ("                    Max Power: ");
				
					for (Thruster thruster : rockets.get(i).getThrusters()) {
						System.out.print("[" + thruster.getMaxPower() + "] ");
					}
				System.out.println  ("");
				System.out.print  ("                Current Power: ");
					for (Thruster thruster : rockets.get(i).getThrusters()) {
						if (thruster.getCurrentPower() < 10) {
							System.out.print("[ ");
						} else {
							System.out.print("[");
						}
						System.out.print(thruster.getCurrentPower() + "] ");
					}
					System.out.println	("");
					System.out.println	("");
				
				i++;
				j++;
				
			}
			
		System.out.println	(" key(8) Power Up [+1] | key(2) Power Down [-1] | key(0) Return");
		System.out.println	("");
		System.out.println	("**************************************************************");
		System.out.println  ("Rocket Selected: " + rocketSel);
		System.out.println	("");
	
	}
	
	public static void valPowerDataEntry(Rocket rocket) {
		
		int valPowerDataEntry = 0;
		int valSpeedDataEntry = -1;
		
		try {
			while (valSpeedDataEntry != 0) {	
				showConsole(rockets, rocket);
				
				System.out.println("Entry a Power Value: ");
				valPowerDataEntry = powerDataEntry.nextInt();
				System.out.println("Press key(8) Power Up [+1]  or Press key(2) Power Down [-1]");
				valSpeedDataEntry = speedDataEntry.nextInt();
				
				switch (valSpeedDataEntry) {
					case 0:
						valSpeedDataEntry = 0;
						break;
					case 8:
						rocket.speedUp(rocket, valPowerDataEntry);
						break;
					case 2:
						rocket.brake(rocket, valPowerDataEntry);
						break; 
					default:
						System.out.println("Invalid option.");
				}				
			}	
		} finally {
			//System.out.println("_ERROR");
		}
		
	}
	
	public static void exit() {
		
		//t.interrupt();
		
	}
	
}