package com.source;

public class MainClass {

	public static void main(String[] args) {
		Car c=new BMW();
		c.applyBrake();
		c.applyClutch();
		c.acceleration();
		c.changeGears();
		Car c1=new Audi();
		c1.applyBrake();
		c1.applyClutch();
		c1.acceleration();
		c1.changeGears();
		Car c2=new RangeRove();
		c2.applyBrake();
		c2.applyClutch();
		c2.acceleration();
		c2.changeGears();
		Car c3=new Kia();
		c3.applyBrake();
		c3.applyClutch();
		c3.acceleration();
		c3.changeGears();
	}

}
