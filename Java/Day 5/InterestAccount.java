package com.src;

import java.util.Scanner;

public class InterestAccount extends RegularAccount {
	String accholdername;
	double balance;
	String pin;
	double interest;
	
	public void calculateInterest()
	{
		balance=getbalance();
		interest = (balance*7)/(12*100);
		setInterest(interest);
	}
	public void setInterest(double interest)
	{
		this.interest=interest;
	}
	public void setAccountHolderName(String accholdername){
		this.accholdername=accholdername;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public void setPin(String pin)
	{
		this.pin=pin;
	}
	public double getbalance()
	{
		return balance;
	}
	public void getname()
	{
		System.out.println("Account Holder Name:"+accholdername);
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
		setAccountHolderName(accholdername);
		setBalance(balance);
		setPin(pin);
	}
	public void display()
	{
		System.out.println("-----------Account details----------------");
		System.out.println("Account Holder Name:"+accholdername);
		System.out.println("Balance:"+balance);
		System.out.println("PIN:"+pin);
		System.out.println("Interest:"+interest);
		System.out.println("---------------------------------------------------");
	}
}