package com.ripples.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		
		Map<String, Long> mapofPeople = new LinkedHashMap<String, Long>();
		mapofPeople.put("Mark", 98858791L);
		mapofPeople.put("Mike", 98858792L);
		mapofPeople.put("Tony", 98858793L);
		mapofPeople.put("David", 9885874L);
		
		System.out.println(mapofPeople.get("David"));
		
		mapofPeople.remove("Mark");
		System.out.println("Find Tony : "+mapofPeople.get("Tony"));
		//iterate map
		
		for(Map.Entry<String, Long> entry: mapofPeople.entrySet()) {
			System.out.println("Key "+entry.getKey());
			System.out.println("Value "+entry.getValue());
			System.out.println("---------------");
		}
	}

}
