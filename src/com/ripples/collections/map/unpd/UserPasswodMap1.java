package com.ripples.collections.map.unpd;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UserPasswodMap1 {

	public static void main(String[] args) {

		Map<String, String> upmap = new LinkedHashMap<String, String>();

		boolean until = true;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Enter your username:");
			String un = scan.nextLine();
			System.out.print("Enter your password:");
			String pw = scan.nextLine();

			String newmap = upmap.put(un, pw);

			if (upmap != null) {
				System.out.println("Username: " + un + " | passowrd: " + pw);
				System.out.println(" ");
			}
			System.out.print("wanna add another entry (y/n)?");
			String ans = scan.nextLine();

			if (ans.equals("y") || ans.equals("Y")) {
				continue;
			} else {
				break;
			}

		} while (until);
		

		System.out.println("--------- Database ---------------");
		System.out.println(" Username: | Password:");
		for (String id: upmap.keySet()) {
			System.out.println(" "+id+"         "+upmap.get(id));
			}
			System.out.println("----------------------------");
			System.out.println(" ");
		
		System.out.print("::Already Registered? \nEnter your user name:");
		String uiname = scan.nextLine();
//		System.out.println("You entered :" + uiname);
		if (upmap.containsKey(uiname)) {
			while (until) {
				System.out.print("Enter your password:");
				String uipwd = scan.nextLine();
				if (upmap.get(uiname).equals(uipwd)) {
					System.out.println("Login successful!");
					break;
				} else {
					System.out.println("Invalid password. please try again!");
					continue;
				}
			}
		} else {
			System.out.println("User not available!");
			// method:createNewUser();
		}
	}

}
