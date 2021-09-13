package com.src;
import java.util.Scanner;
public class RegularAccount {
	String accholdername;
	double balance;
	String pin;
	double minbalance;
	double penalty;
	
	Scanner sc=new Scanner(System.in);
	public void calculatePenalty(double minbalance,double balance)
	{
		if(minbalance < 500.00)
		{
			setPenalty(10.00);
			System.out.println("There is a penalty of Rs 10/- because minimum balance is < 500.00");
		}
		else if(balance <= 10.00 || balance  <= balance*10/100)
		{
			setPenalty(10.00);
			System.out.println("There is a penalty of Rs 10/- because balance is < 10% of the current balance");
		}
		else
			System.out.println("There is no penalty to be paid");
	}
	public void setPenalty(double penalty)
	{
		this.penalty=penalty;
	}
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	public void setAccountHolderName(String accholdername)
	{
		this.accholdername=accholdername;
	}
	public void setminbalance(double minbalance)
	{
		this.minbalance=minbalance;
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
		System.out.println("Name of account holder:"+accholdername);
	}
	public void createAccount()
	{
		getDetails();
		System.out.println("Account is created successfully...");
	}
	public void getDetails()
	{
		
		System.out.println("Enter Account Holder name");
		String accholdername=sc.next();
		System.out.println("Enter amount ");
		double balance=sc.nextDouble();
		System.out.println("Enter minimum balance for the account");
		double minbalance=sc.nextDouble();
		System.out.println("Enter PIN");
		String pin=sc.next();
		setAccountHolderName(accholdername);
		setbalance(balance);
		setminbalance(minbalance);
		setPin(pin);
	}
	public void depositamount()
	{
		System.out.println("Enter the amount to be deposited...");
		double amount=sc.nextDouble();
		balance=getbalance();
		balance=balance+amount;
		System.out.println(balance);
		setbalance(balance);
	}
	public void withdraw()
	{
		System.out.println("Enter the amount for withdrawal");
		double amount=sc.nextDouble();
		balance=getbalance();
		if(balance>amount)
		{
			balance=balance-amount;
			System.out.println(balance);
			setbalance(balance);
			System.out.println(amount+" is withdrawed successfully..");
		}
		else
			System.out.println("Amount to be withdrawed is greater than than balance amount......So withdrawal can't be done....");
	}
	public void display()
	{
		System.out.println("-----------Account details----------------");
		System.out.println("Account Holder Name:"+accholdername);
		System.out.println("Balance:"+balance);
		System.out.println("Minimum balance:"+minbalance);
		System.out.println("PIN:"+pin);
		System.out.println("Penalty:"+penalty);
		System.out.println("---------------------------------------------");
	}

}
