package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	// Payment rate boss +50%
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 1.5;
			}
		};
	}
	
	// Payment rate employee -15%
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				salaryPerMonth = Math.round((salaryPerMonth / 1.15) * 100) / 100; 
				return salaryPerMonth;
			}
		};
	}
	
	// Payment rate manageer +10%
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 1.1;
			}
		};
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n";
	}
	
	
	
}
