package com.ripples.collections.set;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class IndexOfTreeSet {

	public static void main(String[] args) {
//	The TreeSet class does not allow accessing elements using the index
//	The List classes (ArrayList, LinkedList etc.) do!
	
//	*We can convert the TreeSet to ArrayList/LinkedList and then use the indexOf() method. 
//		This method returns the index of the 'first occurrence' of the specified element in this list, 
//		or -1 if this list does not contain the element.
		
		
		// TreeSet
		TreeSet<Integer> treeset = new TreeSet<>();
		treeset.add(13);
		treeset.add(23);
		treeset.add(53);
		treeset.add(33);
		treeset.add(61);
		treeset.add(41);
		
		System.out.println(treeset);
		
		//to find the index of 23 (1)
		System.out.println("index of 23: "+indexOf(treeset, 23));
		
		// to find the index of 61 (5)
		System.out.println("index of 61: "+indexOf(treeset, 61));
		
		// to find the index of 50 (-1: which is actually not present)
		System.out.println("index of 50 "+indexOf(treeset, 50));
	}
	//method indexOf
	private static int indexOf(TreeSet<Integer> set, Integer i) {
		//step1: convert TreeSet to ArrayList or LinkedList
		List<Integer> list = new ArrayList<Integer>(set);
		//step2: use the indexOf method of the list
		return list.indexOf(i);
	}

}
