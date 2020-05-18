package main;

import java.util.ArrayList;
import java.util.List;

import com.rockets.project.Thruster;
import com.rockets.project.Rocket;

public class Fase_2 {
	
	public static void main(String[] args) {
		
		List<Rocket> rockets = new ArrayList<Rocket>();
		Rocket rocket1;
		Rocket rocket2;
		int[] maxPowersThrusterRocket1 = {10, 30, 80};
		int[] maxPowersThrusterRocket2 = {30, 40, 50, 50, 30, 10};
		
		rocket1 = new Rocket("32WESSDS");		
		
		createThrusters(rocket1, maxPowersThrusterRocket1);
		
		rockets.add(rocket1);
		
		rocket2 = new Rocket("LDSFJA32");
		
		createThrusters(rocket2, maxPowersThrusterRocket2);
		
		rockets.add(rocket2);
		
		toString(rockets);
	}
	
	// Thrusters are created and the corresponding powers are added
	public static void createThrusters(Rocket rocket, int[] maxPowers) {
		
		for (int i = 0; i < maxPowers.length; i++) {
			
			Thruster thruster = new Thruster(maxPowers[i]);
			
			rocket.addThruster(thruster);
			
		}
		
	}
	
	public static void toString(List<Rocket> rockets) {
		
		for(Rocket rocket : rockets) {
		
			System.out.print(rocket.toString());
			System.out.println(rocket.getThrusters().toString());
		
		}
		
	}
	
}
