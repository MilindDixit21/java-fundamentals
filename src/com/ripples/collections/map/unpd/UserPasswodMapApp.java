package com.ripples.collections.map.unpd;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UserPasswodMapApp {

	public static void main(String[] args) {

		Map<String, String> upmap = new LinkedHashMap<String, String>();
		createNewUser("nw", upmap);
	}

	private static void createNewUser(String a, Map<String, String> b) {
		boolean until = true;
		System.out.println("___________________________________________________________");
		Scanner scan = new Scanner(System.in);
			System.out.println("======:USER REGISTRTION:======");
			System.out.println("(Please enter username & password to create a new account.)");
			System.out.println("-----------------------------------------------------------");
		do {
			System.out.print("Enter Username:");
			String un = scan.nextLine();
			System.out.print("Hello "+un+"!... Enter password:");
			String pw = scan.nextLine();

			a = b.put(un, pw);

			if (b != null) {
//				System.out.println("Username: " + un + " | passowrd: " + pw);
				System.out.println(" ");
			}
			System.out.print("wanna add another user (y/n)?");
			String ans = scan.nextLine();

			if (ans.equals("y") || ans.equals("Y")) {
				continue;
			} else {
				break;
			}

		} while (until);

		System.out.println("--------- Database ---------------");
		System.out.println(" Username: | Password:");
		for (String id : b.keySet()) {
			System.out.println(" " + id + "         " + b.get(id));
		}
		System.out.println("----------------------------------");
		System.out.println(" ");

//		scan.close();
		choices("a", b);
	}
	
	public static void choices(String a, Map<String, String> b) {
		System.out.println("==========:Welcome to UNPDL:============");
		System.out.print("1. Registered User? Enter your UserName   \n2. Create New Account  \n3. Exit \n----------------------------------------  \nYour Please enter your option::");
		Scanner s3 = new Scanner(System.in);
		int choice = s3.nextInt();

		switch (choice) {
		case 1:
			findUser("a", b);
			break;
		case 2:
			createNewUser("nw", b);
			break;
		case 3:
			System.out.println("__________________________________");
			System.out.println("----------------------------------");
			System.out.println("Successfully logged out.");
			System.out.println("----------------------------------");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid selection. please choose correct option");

		}
//		s3.close();
	}
	
	public static void findUser(String uiname, Map<String, String> b) {
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Enter your registered user name:");
		uiname = scan2.nextLine();
//		System.out.println("You entered :" + uiname);
		if (b.containsKey(uiname)) {
			while (true) {
				System.out.print("Enter your password:");
				String uipwd = scan2.nextLine();
				if (b.get(uiname).equals(uipwd)) {
					System.out.println("Login successful!");
					System.exit(0);
					break;
				} else {
					System.out.println("-----------------------------------------");
					System.out.println("***Invalid password***. please try again!");
					continue;
				}
			}
		} else {
			System.out.println("User not available.");
			createNewUser("nw", b);

		}
//		scan2.close();
	}

}
