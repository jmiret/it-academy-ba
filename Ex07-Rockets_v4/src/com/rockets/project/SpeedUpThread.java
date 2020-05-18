package com.rockets.project;

public class SpeedUpThread implements Runnable {
	
	private Thruster thruster;
	private Integer currentPower = 0;
	
	public SpeedUpThread(Thruster thruster, Integer currentPower) {
		this.thruster = thruster;
		this.currentPower = currentPower;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//long initialTime = System.currentTimeMillis();
		
		thruster.setCurrentPower(this.currentPower, true);
		
		/*
		for (int i = 0; i < this.currentPower; i++) {
			thruster.setCurrentPower(this.currentPower, true);
			System.out.println((System.currentTimeMillis() - initialTime) / 1000 + "\"");
			
			try {
				Thread.sleep(1000);
				//Thread.sleep((int) Math.random()*10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}	
		*/
		
			
	}

}
