package com.account;

import java.util.Scanner;

public class BankAccountMain {
  public static void main(String[] args) {
    int choice;
    BankAccount b[] = new BankAccount[10];
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("1. Create Account\n2. Withdraw Amount\n3. Deposit Amount\n4. check Balance\n5. calculate Interest\n6. view Account Details\n7. Exit");
      System.out.println("choose from the menu...");
      choice = sc.nextInt();
      switch(choice) {
        case 1:
          System.out.println("Enter the number of accounts to create: ");
          int n = sc.nextInt();
          for(int i = 0; i < n; i++) {
        	b[i] = new BankAccount();
            b[i].createAccount();
          }
          break;
        case 2:
          System.out.println("Enter the account number: ");
          int number = sc.nextInt();
          int len = b.length;
          for(int i = 0; i < len; i++) {
        	int acuntnumber = b[i].getAccountNumber();
            if(acuntnumber == number) {
              System.out.println("Enter the amount for withdrawal: ");
              double amount = sc.nextDouble();
              b[i].withdrawAmount(amount);
              break;
           }
          }
          break;
        case 3:
          System.out.println("Enter the account number: ");
          int num = sc.nextInt();
          int length = b.length;
          for(int i = 0; i < length; i++) {
            int acuntnumber = b[i].getAccountNumber();
            if(acuntnumber == num) {
              System.out.println("Enter the amount to be deposited: ");
              double amount = sc.nextDouble();
              b[i].depositAmount(amount);
              break;
            }
          }
          break;
        case 4:
          System.out.println("Enter the account number: ");
          int anumber = sc.nextInt();
          int ln = b.length;
          for(int i = 0; i < ln; i++) {
            int acuntnumber = b[i].getAccountNumber();
            if(acuntnumber == anumber) {	
            	b[i].checkBalance();
            	break;
            }
          }  
          break;
        case 5:
          System.out.println("Enter account number: ");
          int anum = sc.nextInt();
          int l = b.length;
          for(int i = 0; i < l; i++) {
            int actnum = b[i].getAccountNumber();
            if(actnum == anum) {
            	b[i].calculateInterest(b[i].getAccounttype());
            	break;
            }
          }
          break;
        case 6:
          for(int i = 0; i < b.length - 1; i++) {
            b[i].displayAccountDetails();
          }
          break;
        case 7:
          System.out.println("Loop terminated.........");
          break;
        default:
          System.out.println("Invalid choice");
      }
    }while(choice  > 0 && choice < 7);
  }
}