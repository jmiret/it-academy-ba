package com.rockets.project;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
	
	private String code;
	private Integer numThrusters;
	private List<Thruster> thrusters = new ArrayList<Thruster>();
	private Thread lastThread;
	
	public Rocket(String code) {
		this.code = code;
	}
	
	public Rocket(String code, Integer numThrusters) {
		this.code = code;
		this.numThrusters = numThrusters;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getNumThrusters() {
		return numThrusters;
	}

	public void setNumThrusters(Integer numThrusters) {
		this.numThrusters = numThrusters;
	}

	public List<Thruster> getThrusters() {
		return thrusters;
	}

	public void setThrusters(List<Thruster> thrusters) {
		this.thrusters = thrusters;
	}
	
	public void addThruster(Thruster thruster) {
		this.thrusters.add(thruster);
	}
	
	public void speedUp(Rocket rocket, Integer power) {
		
		for (Thruster thruster : rocket.getThrusters()) {
		
			SpeedUpThread r = new SpeedUpThread(thruster, power);
			
			Thread t = new Thread(r);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			t.start();
			
			this.lastThread = t;
			
			/*
			try {
				t.join;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			
		}	
		
		// The main thread has interrupted until the last speed up thread has completed.
		try {
			rocket.lastThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public void brake(Rocket rocket, Integer power) {

		for (Thruster thruster : rocket.getThrusters()) {
			
			BrakeThread r = new BrakeThread(thruster, power);
			
			Thread t = new Thread(r);
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
									
			t.start();
			
			this.lastThread = t;
			
		}	
		
		// The main thread has interrupted until the last speed up thread has completed.
		
		try {
			rocket.lastThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String toString() {
		return 	"Code: " + this.code + " ";
	}
	
}
