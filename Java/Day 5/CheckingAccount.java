package com.src;

import java.util.Scanner;

public class CheckingAccount extends InterestAccount{
	String accholdername;
	double balance;
	String pin;
	double minbalance;
	double penalty;
	double interest;
	int transactions;
	
	public void calculateInterest()
	{
		balance=getbalance();
		interest = ((balance*7)/(12*100))*12;
		setInterest(interest);
	}
	public void setInterest(double interest)
	{
		this.interest=interest;
	}
	public void setAccountHolderName(String accholdername)
	{
		this.accholdername=accholdername;
	}
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	public void setPin(String pin)
	{
		this.pin=pin;
	}
	public void setTransactions(int transactions)
	{
		this.transactions=transactions;
	}
	public void setminbalance(double minbalance)
	{
		this.minbalance=minbalance;
	}
	public double getbalance()
	{
		return balance;
	}
	public void getname()
	{
		System.out.println("Account Holder Name:"+accholdername);
	}
	public double getminbalance()
	{
		return minbalance;
	}
	public int gettransactions()
	{
		return transactions;
	}
	public void calculatePenalty()
	{
		minbalance=getminbalance();
		balance=getbalance();
		if(minbalance < 1000.00)
		{
			setPenalty(10.00);
			System.out.println("There is a penalty of Rs 10/- because minbalance < 1000.00");
		}
		else
			System.out.println("There is no penalty to be paid");
	}
	public void setPenalty(double penalty)
	{
		this.penalty=penalty;
	}
	public double getpenalty()
	{
		return penalty;
	}
	public void calculateTransactionPenalty()
	{
		transactions=gettransactions();
		penalty=getpenalty();
		penalty=penalty+(transactions*0.10);
		System.out.println("There is a penalty of rs "+penalty+ "for "+ transactions+" transactions");
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
		System.out.println("Enter minimum balance for the account");
		double minbalance=sc.nextDouble();
		System.out.println("Enter number of transactions made");
		int transactions=sc.nextInt();
		setAccountHolderName(accholdername);
		setbalance(balance);
		setPin(pin);
		setminbalance(minbalance);
		setTransactions(transactions);
	}
	public void display()
	{
		System.out.println("-----------Account details----------------");
		System.out.println("Account Holder Name:"+accholdername);
		System.out.println("Balance:"+balance);
		System.out.println("Minimum balance:"+minbalance);
		System.out.println("PIN:"+pin);
		System.out.println("Penalty:"+penalty);
		System.out.println("Transactions:"+transactions);
		System.out.println("Interest:"+interest);
		System.out.println("-----------------------------------------------");
	}
}
