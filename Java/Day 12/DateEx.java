package com.src1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateEx {
 /**
  * @param args The command line arguments
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter DOB in yyyy-mm-dd format:");
    String input  = sc.nextLine();
    LocalDate dob = LocalDate.parse(input);
    LocalDate curDate = LocalDate.now(); 
    System.out.println(Period.between(dob, curDate).getYears() + " years");
    System.out.println(Period.between(dob, curDate).getMonths() + " months");
    System.out.println(Period.between(dob, curDate).getDays() + " days");
  }

}
