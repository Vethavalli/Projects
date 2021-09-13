package com.source;

public abstract class Animal {
	protected int legs;
	protected Animal(int legs)
	{
		this.legs=legs;
	}
	public abstract void eat();
	public void walks()
	{
		System.out.println("Animal walks with "+legs+" legs");
	}
	
}
