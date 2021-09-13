
package com.account;

public interface Account {
  public void withdrawAmount(double amount);
  public void depositAmount(double amount);
  public void checkBalance();
  public void calculateInterest(String acnttype);
  public void createAccount();
  public void displayAccountDetails();
}
