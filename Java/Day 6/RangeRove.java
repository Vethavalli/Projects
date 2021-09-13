package com.source;

public class RangeRove implements Car {

	@Override
	public void acceleration() {
		System.out.println("Accelerator is applied to RangeRove");
		
	}

	@Override
	public void applyBrake() {
		System.out.println("Brake is applied to RangeRove.....");
		
	}

	@Override
	public void applyClutch() {
		System.out.println("Clutch is applied to RangeRove..");
		
	}

	@Override
	public void changeGears() {
		System.out.println("Change to next Gear...");
		
	}

}
