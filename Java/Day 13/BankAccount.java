package com.account;

import java.util.Scanner;

public class BankAccount implements Account {
  public static int accountnumber = 4562; 
  String accountholdername;
  String accountholderaddress;
  String accounttype;
  double minimumbalance;
  double balance;
  long mobileno;
  int anumber;
  
  public BankAccount() {
    accountnumber ++;
  }

  public BankAccount(String accountholdername, String accounttype, double minimumbalance,
		double balance, String accountholderaddress, long mobileno) {
    super();
    this.accountholdername = accountholdername;
    this.accounttype = accounttype;
    this.minimumbalance = minimumbalance;
    this.balance = balance;
    this.accountholderaddress = accountholderaddress;
    this.mobileno = mobileno;
  }
  
  
  public int getAccountNumber() {
    return anumber;
  }
  public String getAccountholderaddress() {
    return accountholderaddress;
  }

  public void setAccountholderaddress(String accountholderaddress) {
    this.accountholderaddress = accountholderaddress;
  }

  public long getMobileno() {
    return mobileno;
  }

  public void setMobileno(long mobileno) {
    this.mobileno = mobileno;
  }
  
  public String getAccountholdername() {
    return accountholdername;
  }

  public void setAccountholdername(String accountholdername) {
    this.accountholdername = accountholdername;
  }

  public long getAccountnumber() {
    return accountnumber;
  }

  public String getAccounttype() {
    return accounttype;
  }

  public void setAccounttype(String accounttype) {
    this.accounttype = accounttype;
  }

  public double getMinimumbalance() {
    return minimumbalance;
  }

  public void setMinimumbalance(double minimumbalance) {
    this.minimumbalance = minimumbalance;
  }

  public double getBalance() {
    return balance;
  }
  
  public void setAccountNumber(int accountnumber) {
	  this.anumber = accountnumber;
  }
  
  public void setBalance(double balance) {
    this.balance = balance;
  }

  @Override
  public void withdrawAmount(double amount) {
    double balance = getBalance();
    if(amount < balance) {
      balance = balance - amount;
      setBalance(balance);
      System.out.println("Amount withdrawed successfully....");
    }
    else {
    	System.out.println("Amount to be withdrawn is greater than the balance amount...So withdrawal cannot be done....");
    }
	
}

  @Override
  public void depositAmount(double amount) {
    double balance = getBalance();
    balance = balance + amount;
    setBalance(balance);
    System.out.println("Amount deposited successfully.......");
	
  }

  @Override
  public void checkBalance() {
    System.out.println("Your current balance is : " + getBalance());	
	
  }

  @Override
  public void calculateInterest(String acnttype) {
    if(acnttype.equalsIgnoreCase("savings")) {
      double balance=getBalance();
      double interest = (balance*5)/(12*100);
      System.out.println("Your interest for the curent balance of savings account is: " + interest);
    }
    else if(acnttype.equalsIgnoreCase("fixed")) {
      double balance=getBalance();
      double interest = (balance*6.25)/(12*100);
      System.out.println("Your interest for the current balance of fixed account is: " + interest); 
    }
    else if(acnttype.equalsIgnoreCase("salary")) {
      double balance=getBalance();
      double interest = (balance * 3.50) / (12 * 100);
      System.out.println("Your interest for the current balance of salary account is: " + interest); 
    }
    else if(acnttype.equalsIgnoreCase("Recurring deposit")) {
      double balance=getBalance();
      double interest = (balance*5.50)/(12*100);
      System.out.println("Your interest for the current balance of Recurring deposit account is: " + interest); 
    }
    else {
      System.out.println("Invalid account to calculate interest.....");
    }
	
  }

  @Override
  public void createAccount() {
	System.out.println("Enter the details....");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter AccountHolderName:");
	String accountholdername = sc.nextLine();
	System.out.println("Enter the address:");
	String accountholderaddress = sc.nextLine();
	System.out.println("Enter contact number:");
	long mobileno = sc.nextLong();
	System.out.println("Enter the type of account (Savings/salary/fixed deposit/Recurring deposit) Account:");
	String accounttype = sc.next();
	System.out.println("Enter the minimum amount to be deposited while creating account:");
	double minimumbalance = sc.nextDouble();
	System.out.println("Enter the amount you want to deposit:");
	double balance = sc.nextDouble();
	setAccountholdername(accountholdername);
	setAccountholderaddress(accountholderaddress);
	setMobileno(mobileno);
	setAccounttype(accounttype);
	setMinimumbalance(minimumbalance);
	setBalance(balance);
	setAccountNumber(accountnumber);
	System.out.println(getAccountNumber());
	System.out.println("Account created successfully.......");
	System.out.println("Your Account number is: " + accountnumber);
  }

  @Override
  public void displayAccountDetails() {
    System.out.println("Account Details---------------");
    System.out.println("AccountHolderName:" + accountholdername);
    System.out.println("AccountNumber:" + anumber);
    System.out.println("AccountHolderAddress:" + accountholderaddress);
    System.out.println("Contact Number:" + mobileno);
    System.out.println("AccountType:" + accounttype);
    System.out.println("MinimumBalance:" + minimumbalance);
    System.out.println("Balance:" + balance);
    System.out.println("--------------------------------------------------------------");
  }
  
}
