package com.src;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student("Abi",101,20, 70,80,90);
		s1.total=s1.getTotal(70, 80, 90);
		s1.average=s1.getAverage(s1.total);
		s1.grade=s1.grade(s1.average);
		s1.display();
		Student s2=new Student("nithya",102,17, 80,70,60);
		s2.total=s2.getTotal(80, 70, 60);
		s2.average=s2.getAverage(s2.total);
		s2.grade=s2.grade(s2.average);
		s2.display();
	}

}
