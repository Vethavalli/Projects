package com;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapEx {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1,"Apple");
		hm.put(2,"Banana");
		hm.put(3,"Grapes");
		hm.put(4,"Orange");
		hm.put(5,"Mango");
		hm.put(6,"JackFruit");
		System.out.println(hm);
		
		System.out.println("--------------------------------------------------------");
		System.out.println("27.To check map contains mapping for specified value............");
		System.out.println(hm.containsKey(3));
		System.out.println(hm.containsValue("Guava"));
		
		System.out.println("--------------------------------------------------------");
		System.out.println("28.Set view for the Hash map...........");
		System.out.println("Set View:"+hm.entrySet());
		
		System.out.println("--------------------------------------------------------");
		System.out.println("29.Value for the specified key in hash map...........");
		System.out.println("Value:"+hm.get(4));
		
		System.out.println("----------------------------------------------------------");
		System.out.println("30.Set View for keys.....................");
		System.out.println(hm.keySet());

		System.out.println("----------------------------------------------------------");
		System.out.println("31.Collection View for values.....................");
		System.out.println(hm.values());
		
		System.out.println("----------------------------------------------------------");
		System.out.println("32.Print portion of keys in the map inclusive and exclusive.....................");
		TreeMap tm = new TreeMap(hm);
		System.out.println(tm.subMap(2,true, 5, false));
		
		System.out.println("----------------------------------------------------------");
		System.out.println("33.Print portion of keys in the map.....................");
		System.out.println(tm.subMap(3,5));
		
		System.out.println("----------------------------------------------------------");
		System.out.println("34.Print portion of keys in the map whose value is greater than given value.....................");
		TreeMap tm1 = new TreeMap((o1,o2)->(Integer)o1 > (Integer)15 ?1:0);
		tm1.put(21, "SkyBlue");
		tm1.put(12, "Violet");
		tm1.put(18, "Pink");
		tm1.put(5, "Brown");
		tm1.put(10, "Green");
		tm1.put(14, "Yellow");
		System.out.println(tm1);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("35.Print the least key and value if the given value is greater.....................");
		TreeMap tm2 = new TreeMap();
		tm2.put(1, "SkyBlue");
		tm2.put(2, "Violet");
		tm2.put(8, "Pink");
		tm2.put(5, "Brown");
		tm2.put(3, "Green");
		tm2.put(4, "Yellow");
		System.out.println(tm2);
		System.out.println(tm2.ceilingEntry(2));
		System.out.println(tm2.ceilingEntry(9));
		
		System.out.println("----------------------------------------------------------");
		System.out.println("36.Print the least key if the given value is greater.....................");
		System.out.println(tm2.ceilingKey(5));
		System.out.println(tm2.ceilingKey(12));
		
		
	}

}
