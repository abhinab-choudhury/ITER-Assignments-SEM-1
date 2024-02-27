package LabAssignment;

import java.util.Scanner;

public class A1Q5 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter you Name : ");
		String name = obj.next();
		System.out.print("Enter a Greeting Message : ");
		obj.nextLine();
		String greeting_message = obj.nextLine();
		System.out.println("Hey " + name + ", " + greeting_message);
		obj.close();
	}
}
