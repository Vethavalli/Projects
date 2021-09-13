package com;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayListCollection {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Sky blue");
		al.add("violet");
		al.add("Red");
		al.add("Yellow");
		al.add("Pink");
		al.add("White");
		System.out.println("1.Printing elements in the collection class....");
		System.out.println(al);
		
		System.out.println("----------------------------------------------");
		System.out.println("2.Printing elements through iterator....");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("3.Inserting the element at first position....");
		al.add(0, "green");
		System.out.println(al);
		
		System.out.println("----------------------------------------------");
		System.out.println("4.Retriving an element at a specified index.....");
		System.out.println("Element at index 5:"+al.get(4));
		
		System.out.println("--------------------------------------------------");
		System.out.println("5.To update a specific array element.......");
		al.set(2,"brown");
		System.out.println(al);
		
		System.out.println("------------------------------------------------");
		System.out.println("6.To check arraylist is empty or not.......");
		System.out.println(al.isEmpty());
		
		System.out.println("---------------------------------------------------");
		System.out.println("7.Trim the size of the arrayList...... ");
		al.trimToSize();
		
		System.out.println("-------------------------------------------------");
		System.out.println("8.Increasing size of the array list......");
		ArrayList al1 = new ArrayList(20);
		
		System.out.println("---------------------------------------------------");
		System.out.println("9.Replacing the second element in arraylist.........");
		al.set(1,"Grey");
		System.out.println(al);
		
		System.out.println("------------------------------------------------------");
		System.out.println("10.Retriving elements using its position........");
		for(int i = 0;i < al.size();i ++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("11.Declaring and adding elements to the hashset......");
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(14);
		hs.add(25);
		hs.add(-65);
		hs.add(-34);
		hs.add(87);
		System.out.println(hs);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("12.Converting hashset To array.......");
		hs.toArray();
		System.out.println(hs);
		
		System.out.println("------------------------------------------------------");
		System.out.println("13.Converting hashset to ArrayList........");
		al1.addAll(hs);
		System.out.println(al1);
		
		System.out.println("------------------------------------------------------");
		System.out.println("14.Converting hashset to treeset.........");
		TreeSet ts =new TreeSet();
		ts.addAll(hs);
		System.out.println(ts);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("15.Comparing two hashsets........ ");
		HashSet hs1 = new HashSet();
		hs1.add(12);
		hs1.add(14);
		hs1.add(25);
		hs1.add(72);
		hs1.add(-34);
		hs1.add(87);
		System.out.println(hs.equals(hs1));
		
		System.out.println("---------------------------------------------------------");
		System.out.println("16.Removing all elements in hashset........ ");
		hs1.removeAll(hs1);
		System.out.println( hs1);
		
		System.out.println("------------------------------------------------------------");
		System.out.println("17.Comparing two sets and print the same elements........");
		TreeSet ts1 = new TreeSet();
		ts1.add(12);
		ts1.add(25);
		ts1.add(-34);
		ts1.add(15);
		ts1.add(2);
		ts1.add(98);
		ts.retainAll(ts1);
		System.out.println(ts);
		
		System.out.println("------------------------------------------------------------");
		System.out.println("18.The elements which are strictly greater than or equal to the given element........");
		TreeSet ts2 = new TreeSet((o1,o2)->(Integer)o1 >= (Integer)89?1:0);		
		ts2.add(525);
		ts2.add(34);
		ts2.add(3);
		ts2.add(89);
		ts2.add(100);
		ts2.add(198);
		System.out.println(ts2);
		
		System.out.println("------------------------------------------------------------");
		System.out.println("The elements which are strictly lesser than the given element........");
		TreeSet ts3 = new TreeSet((o1,o2)->(Integer)o1 < (Integer)89?1:0);
		ts3.add(25);
		ts3.add(34);
		ts3.add(3);
		ts3.add(9);
		ts3.add(100);
		ts3.add(198);
		System.out.println(ts3);
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Remove the first element of tree set........");
		System.out.println(ts);
		ts.remove(ts.first());
		System.out.println(ts);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Remove the last element of tree set........");
		System.out.println(ts);
		ts.remove(ts.last());
		System.out.println(ts);
		
	}
	

	
	
	
}
