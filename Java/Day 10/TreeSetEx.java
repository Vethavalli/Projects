package com;

import java.util.TreeSet;

public class TreeSetEx {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(14);
		ts.add(24);
		ts.add(-89);
		ts.add(78);
		ts.add(65);
		ts.add(-2);
		ts.add(90);
		System.out.println(ts);
		
		System.out.println("----------------------------------------------");
		System.out.println("19.Retrieve and remove the first element......");
		ts.remove(ts.first());
		System.out.println(ts);
		
		System.out.println("----------------------------------------------");
		System.out.println("20.Retrieve and remove the last element......");
		ts.remove(ts.last());
		System.out.println(ts);
		
		System.out.println("----------------------------------------------");
		System.out.println("21.Removing the given element......");
		ts.remove(65);
		System.out.println(ts);
		

	}

}
