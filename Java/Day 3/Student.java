package com.src;

public class Student {
	String studentname;
	int rollno;
	int age;
	int mark1,mark2,mark3;
	int total;
	int average;
	char grade;

	public Student(){

	}
	public Student(String studentname,int rollno,int age,int mark1,int mark2,int mark3)
	{
		this.studentname=studentname;
		this.rollno=rollno;
		this.age=age;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	public int getTotal(int mark1,int mark2,int mark3)
	{
		int sum=0;
		sum=mark1+mark2+mark3;
		return sum;
	}
	public int getAverage(int total)
	{
		int avg=total/3;
		return avg;
	}
	public char grade(int avg)
	{
		if(avg>75)
			return 'A';
		else if(avg>65 && avg<=75)
			return 'B';
		else if(avg>35 && avg<=65)
			return 'C';
		else
			return 'D';
	}
	public void display()
	{
		System.out.println("Studentname:"+studentname);
		System.out.println("Rollno:"+rollno);
		System.out.println("Age:"+age);
		System.out.println("Marks");
		System.out.println("Maths:"+mark1);
		System.out.println("Physics:"+mark2);
		System.out.println("Chemistry:"+mark3);
		System.out.println("Total:"+total);
		System.out.println("Average:"+average);
		System.out.println("Grade:"+grade);
	}
}