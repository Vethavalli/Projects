package com.source;

public class BMW implements Car {

	@Override
	public void acceleration() {
		System.out.println("Accelerator is applied to BMW");
		
	}

	
	public void applyBrake() {
		System.out.println("Brake is applied to BMW.....");
	}

	@Override
	public void applyClutch() {
		System.out.println("Clutch is applied to BMW...");
		
	}

	@Override
	public void changeGears() {
		System.out.println("Change to next Gear...");
		
	}

}
