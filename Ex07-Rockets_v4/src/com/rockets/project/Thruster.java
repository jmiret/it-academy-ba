package com.rockets.project;

public class Thruster {
	
	private Integer maxPower = 0;
	private Integer currentPower = 0;
	
	public Thruster(Integer maxPower) {
		this.maxPower = maxPower;		
	}
	
	public Thruster(Integer maxPower, Integer currentPower) {
		this.maxPower = maxPower;
		this.currentPower = currentPower;
	}
	
	public Integer getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(Integer maxPower) {
		this.maxPower = maxPower;
	}
	
	public Integer getCurrentPower() {
		return currentPower;
	}
	
	public void setCurrentPower(Integer currentPower, boolean speedUpOrBrake) {
		long initialTime = System.currentTimeMillis();
		
		if (speedUpOrBrake) {
			for (int i = 0; i < currentPower; i++) {
				if(this.currentPower < this.maxPower)
					this.currentPower += 1;
					
				System.out.println ("Thread: " + Thread.currentThread().getId() + " | " +
						 		  "Max Power: [" + this.getMaxPower() + "] | " +
						 		  "Current Power: +1 [" + this.getCurrentPower() + "] | " +
						 		  "Time: " +(System.currentTimeMillis() - initialTime) / 1000 + "\"");
				try {
					
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
					
		} else {
			for (int i = 0; i < currentPower; i++) {
				if(this.currentPower != 0)
					this.currentPower -= 1;
					
				System.out.println ("Thread: " + Thread.currentThread().getId() + " | " +
						 		  "Max Power: [" + this.getMaxPower() + "] | " +
						 		  "Current Power: -1 [" + this.getCurrentPower() + "] | " +
						 		  "Time: " +(System.currentTimeMillis() - initialTime) / 1000 + "\"");
				try {
					
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}	
		}
		
	}
	
	public void setCurrentPower_1(Integer currentPower, boolean speedUpOrBrake) {
		long initialTime = System.currentTimeMillis();
		
		if (speedUpOrBrake) {
			for (int i = 0; i < currentPower; i++) {
				if(this.currentPower < this.maxPower)
					this.currentPower += 1;
				System.out.println ("Thread: " + Thread.currentThread().getId() + " | " +
									"Max Power: [" + this.getMaxPower() + "] | " +
									"Current Power: +1 [" + this.getCurrentPower() + "] | " +
									(System.currentTimeMillis() - initialTime) / 1000 + "\"");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			for (int i = currentPower; i > 0; i--) {
				if(this.currentPower != 0)
					this.currentPower -= 1;
				System.out.println	("Thread: " + Thread.currentThread().getId() + " | " +
									 "Max Power: [" + this.getMaxPower() + "] | " +
									 "Current Power: -1 [" + this.getCurrentPower() + "] | " +
									 (System.currentTimeMillis() - initialTime) / 1000 + "\"");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	@Override
	public String toString() {
		return this.maxPower.toString();
	}
	
}
