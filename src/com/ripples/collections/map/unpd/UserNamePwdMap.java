package com.ripples.collections.map.unpd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserNamePwdMap {

	public static void main(String[] args) {

		Map<String, String> upmap = new HashMap<String, String>();

		boolean until = true;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Enter your username:");
			String un = scan.nextLine();
			System.out.println("Enter your password");
			String pw = scan.nextLine();

			upmap.put(un, pw);

			if (upmap != null) {
				System.out.println("Username: " + un + " | passowrd: " + pw);
				System.out.println(" ");
			}
			System.out.println("wanna add another entry (y/n)?");
			String ans = scan.nextLine();

			if (ans.equals("y") || ans.equals("Y")) {
				continue;
			} else {
				break;
			}

		} while (until);

		System.out.println("Following username & passwords are available in database");
		for (Map.Entry<String, String> entry : upmap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " |Value: " + entry.getValue());

			System.out.println("Already Registered! Enter your user name:: ");
			String uiname = scan.nextLine();
			System.out.println("You entered :" + uiname);
			if (entry.getKey().equals(uiname)) {
				while (until) {
					System.out.println("Enter your password::");
					String uipwd = scan.nextLine();
					if (entry.getValue().equals(uipwd)) {
						System.out.println("Login successful!");
						break;
					} else {
						System.out.println("Invalid password. please try again!");
						continue;
					}
				}
			} else {
				System.out.println("Invalid username");
			}
		}
		scan.close();
	}

}
