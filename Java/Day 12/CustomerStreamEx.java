package com.src1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerStreamEx {
  /**
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    ArrayList<Customer> al = new ArrayList<Customer>();
    al.add(new Customer(12, "rupa", 6000));
    al.add(new Customer(14, "Abi", 9500));
    al.add(new Customer(16, "anu", 8000));
    al.add(new Customer(22, "ramya", 4500));
    al.add(new Customer(24, "nithya", 9000));
    al.add(new Customer(68, "jhansi", 5500));
    al.add(new Customer(19, "kavya", 1000));
    al.add(new Customer(13, "maha", 600));
    al.add(new Customer(54, "jothi", 7000));
    al.add(new Customer(32, "rupa", 500));
    long result = al.stream().filter((o) -> ((Customer)o).price > 5000).count();
    System.out.println(result);
    List<Customer> l1 = (List<Customer>) al.stream().sorted((i1, i2) -> 
        ((Customer)i1).price  > ((Customer)i2).price ? -1 : 1).collect(Collectors.toList());
    System.out.println(l1.get(0));
  }
}
class Customer {
  int cid;
  String name;
  int price;
  
  public Customer() {
    super();
  }
  
  public Customer(int cid, String name, int price) {
    super();
    this.cid = cid;
    this.name = name;
    this.price = price;
  }
  
  public int getCid() {
    return cid;
  }
  
  public void setCid(int cid) {
    this.cid = cid;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public int getPrice() {
    return price;
  }
  
  public void setPrice(int price) {
    this.price = price;
  }
  
  @Override
  public String toString() {
    return "Customer [" + cid + " " + name + " " + price + "] ";
  }
}