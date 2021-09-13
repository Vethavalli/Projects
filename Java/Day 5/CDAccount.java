package com.src;

import java.util.Scanner;

public class CDAccount extends CheckingAccount {
	String accholdername;
	double balance;
	String pin;
	int months;
	double penalty;
	double interest;
	
	public void calculatePenalty()
	{
		balance=getbalance();
		months=getmonths();
		if(months>12)
		{
			double penalty=(balance*20)/(100);
			setPenalty(penalty);
			System.out.println("There is no withdrawal for 12 months ......so the penalty to be paid is rs "+penalty);
		}
		else
			System.out.println("No penalty to be paid");
	}
	public double getbalance()
	{
		return balance;
	}
	public int getmonths()
	{
		return months;
	}
	public void setPenalty(double penalty)
	{
		this.penalty=penalty;
	}
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	public void setmonth(int months)
	{
		this.months=months;
	}
	public void setPin(String pin)
	{
		this.pin=pin;
	}
	public void setAccountHolderName(String accholdername)
	{
		this.accholdername=accholdername;
	}
	public void calculateInterest()
	{
		balance=getbalance();
		interest = (balance*15)/100;
		setInterest(interest);
	}
	public void setInterest(double interest)
	{
		this.interest=interest;
	}
	public void getname()
	{
		System.out.println("Account Holder Name:"+ accholdername);
	}
	public void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Holder name");
		String accholdername=sc.next();
		System.out.println("Enter amount ");
		double balance=sc.nextDouble();
		System.out.println("Enter PIN");
		String pin=sc.next();
		System.out.println("Enter number of months after last withdrawal is made");
		int months=sc.nextInt();
		setAccountHolderName(accholdername);
		setbalance(balance);
		setPin(pin);
		setmonth(months);
	}
	public void display()
	{
		System.out.println("-----------Account details----------------");
		System.out.println("Account Holder Name:"+accholdername);
		System.out.println("Balance:"+balance);
		System.out.println("PIN:"+pin);
		System.out.println("Penalty:"+penalty);
		System.out.println("No of months after last withdrawal is made:"+months);
		System.out.println("Interest:"+interest);
		System.out.println("----------------------------------------------");
	}
}
