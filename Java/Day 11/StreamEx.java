package com.src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamEx {

	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(new Student1(12,"abi",20,50));
		al.add(new Student1(14,"nithya",12,20));
		al.add(new Student1(16,"ramya",15,30));
		al.add(new Student1(21,"rupa",22,70));
		al.add(new Student1(24,"anu",29,90));
		
		Stream s2 = al.stream();
		List ul = (List) s2.map((o) ->{
			Student1 s1 = (Student1)o;
			s1.mathsmark = s1.mathsmark + 5;
			return s1;
		}).collect(Collectors.toList());
		System.out.println(ul);
		
		Stream s = al.stream();
		List l = (List) s.filter((o)->((Student1)o).mathsmark>35).collect(Collectors.toList());
		
		System.out.println(l);
	
	}

}
class Student1
{
	int id;
	String name;
	int age;
	int mathsmark;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student1(int id, String name, int age, int mathsmark) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mathsmark = mathsmark;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student[id:"+id+" "+"Stname:"+name+" "+"Age:"+age+" "+"Mathsmark:"+mathsmark+"]";
	}

	
	
	
	
	
}

