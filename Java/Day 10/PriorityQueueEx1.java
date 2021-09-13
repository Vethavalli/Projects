package com;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueEx1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.offer(34);
		pq.offer(-45);
		pq.offer(-56);
		pq.offer(90);
		pq.offer(34);
		pq.offer(12);
		System.out.println(pq);
		
		System.out.println("-------------------------------------------------");
		System.out.println("22.Retrieve first element........");
		System.out.println(pq.peek());
		
		System.out.println("-------------------------------------------------");
		System.out.println("23.Retrieve and remove first element........");
		pq.remove(pq.peek());
		System.out.println(pq);

		System.out.println("-------------------------------------------------");
		System.out.println("24.Converting Priority Queue to an array........");
		ArrayList al = new ArrayList(pq);
		System.out.println(al);
		
		System.out.println("-------------------------------------------------");
		System.out.println("25.Converting Priority Queue to String........");
		String s1;
		s1 = pq.toString();
		System.out.println(s1);
		
		System.out.println("----------------------------------------------------");
		System.out.println("26.Converting priority queue to maximum priority queue.......");
		PriorityQueue pq1 = new PriorityQueue((o1,o2)->(Integer)o1 > (Integer)o2?-1:1);
		pq1.offer(24);
		pq1.offer(58);
		pq1.offer(-56);
		pq1.offer(98);
		pq1.offer(34);
		pq1.offer(16);
		System.out.println(pq1);
		
		
	}

}
