package com.source;

public class TestAnimals {

	public static void main(String[] args) {
		Fish d=new Fish();
		Cat c=new Cat("Fluffy");
		Animal a=new Fish();
		Animal e=new Spider();
		Pet p=new Cat();
		d.walks();
		c.eat();
		c.play();
		c.walks();
		a.eat();
		a.walks();
		e.eat();
		e.walks();
		p.setname("Fluffy");
		System.out.println("Name:"+p.getname());
		p.play();
		
		

	}

}
