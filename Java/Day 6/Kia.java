package com.source;

public class Kia implements Car{

	@Override
	public void acceleration() {
		System.out.println("Accelerator is applied to Kia ");
		
	}

	@Override
	public void applyBrake() {
		System.out.println("Brake is applied to kia.....");
		
	}

	@Override
	public void applyClutch() {
		System.out.println("Clutch is applied to kia...");
		
	}

	@Override
	public void changeGears() {
		System.out.println("Change to next Gear...");
		
	}

}
