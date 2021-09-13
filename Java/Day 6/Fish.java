package com.source;

public class Fish extends Animal {

	protected Fish() {
		super(0);
	}
	@Override
	public void eat() {
		System.out.println("Fish is eating........");
	}
	public void walks()
	{
		System.out.println("Fish has no legs and it can't walk.....");
	}
	
}
