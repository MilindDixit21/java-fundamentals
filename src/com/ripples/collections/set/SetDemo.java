package com.ripples.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
				
		TreeSet<String> set1 = new TreeSet<String>(); //maintain specific order(ascending or descending)
		Set<String> set2 = new HashSet<>();					// set random order
		Set<String> set3 = new LinkedHashSet<>();			//preserve insertion order
		
		set1.add("Mango");
		set1.add("Banana");
		set1.add("Kiwi");
		set1.add("Peach");
		
		set2.add("Hartford");
		set2.add("Welington");
		set2.add("Manchester");
		
		set3.add("spring");
		set3.add("summer");
		set3.add("winter");
		
		//----TreeSet-----
		//TreeSet > preserve ascending order
		System.out.println(set1); 
		//TreeSet > descending order
		System.out.println(set1.descendingSet()); 
		
		
		//----HashSet----
		System.out.println(" ");
		//iterator
		Iterator<String> se2 = set2.iterator();
		while(se2.hasNext()) {
			System.out.println(se2.next());
		}
				
		//----LinkedHashSet----
		//advanced for loop
		System.out.println(" ");
		for(String s3 :set3) {
			System.out.println(s3);
		}
	}
}

