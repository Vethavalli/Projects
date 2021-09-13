package com.source;

public class Cat extends Animal implements Pet {
	String name;
	public Cat(String name)
	{
		super(4);
		this.name=name;
	}
	public Cat()
	{
		this(" ");
	}
	public String getname() {
		return name;
	}
	public void walks()
	{
		System.out.println(name+" walks with "+legs+" legs");
	}

	@Override
	public void setname(String name) {
		this.name=name;
		
	}

	@Override
	public void play() {
		System.out.println(name +" is playing......");
		
	}

	@Override
	public void eat() {
		System.out.println(name+" is eating.......");
		
	}

}
