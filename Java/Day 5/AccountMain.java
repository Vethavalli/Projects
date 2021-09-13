package com.src;

public class AccountMain {

	public static void main(String[] args) {
		RegularAccount r=new RegularAccount();
		System.out.println("Enter details for regular account......");
		r.createAccount();
		r.depositamount();
		r.withdraw();
		r.calculatePenalty(r.minbalance,r.balance);
		System.out.println("Balance amt:"+r.getbalance());
		r.getname();
		r.display();
		
		InterestAccount i=new InterestAccount();
		System.out.println("Enter details for interest Account.....");
		i.createAccount();
		i.depositamount();
		i.withdraw();
		i.calculateInterest();
		System.out.println("Balance amt :"+i.getbalance());
		i.getname();
		i.display();
		
		CheckingAccount c=new CheckingAccount();
		System.out.println("Enter details for Checking Account......");
		c.createAccount();
		c.depositamount();
		c.withdraw();
		c.calculateInterest();
		c.calculatePenalty();
		c.calculateTransactionPenalty();
		System.out.println("balance amt:"+c.getbalance());
		c.getname();
		c.display();
		
		CDAccount d=new CDAccount();
		System.out.println("Enter details for CD Account....");
		d.createAccount();
		d.depositamount();
		d.withdraw();
		d.calculateInterest();
		d.calculatePenalty();
		System.out.println("Balance amt:"+d.getbalance());
		d.getname();
		d.display();

	}

}
