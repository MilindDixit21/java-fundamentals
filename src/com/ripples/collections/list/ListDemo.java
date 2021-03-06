package com.ripples.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>(); //better read operations. *NOT Thread safe
//		List<String> list1 = new LinkedList<String>(); //insert, delete, replace. *NOT Thread safe
//		List<String> list1 = new Vector<String>();  //Thread safe
//		List<String> list1 = new Stack<String>();   //Thread safe
		
		
		list1.add("bob");
		list1.add("mike");
		list1.add("Mack");
		System.out.println(list1);
		
		list1.add(2, "tony");
		System.out.println(list1);
		
		list1.remove(3);
		System.out.println(list1);
		
		System.out.println("element at index 2: "+list1.get(2));
		System.out.println(" ");
		//counter for loop : *Indexing
		for(int index=0; index<list1.size(); index++) {
			System.out.println(index+ " : " +list1.get(index));
		}
		
		System.out.println(" ");
		
		//iteration on list	:*No-indexing	
		 Iterator<String> itr = list1.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		
		System.out.println("");
		
		//enhanced for loop: *No indexing
		 for(String lst : list1) {
			 System.out.println(lst);
		 }
	}

}
