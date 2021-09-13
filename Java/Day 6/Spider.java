package com.source;

public class Spider extends Animal {
	public void eat() {
		System.out.println("Spider is eating......");
		
	}
	public void walks()
	{
		System.out.println("Spider walks with "+legs+" legs");
	}
	public Spider()
	{
		super(8);
	}
	
}
