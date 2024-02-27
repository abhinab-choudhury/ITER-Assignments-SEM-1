package LabAssignment;

import java.util.Scanner;

public class A1Q4 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("First Name : ");
		String first = obj.next();
		System.out.print("Middle Name: ");
		String second = obj.next();
		System.out.print("Last Name : ");
		String last = obj.next();
		
		System.out.println(first + "\n" + second + "\n" + last);
		obj.close();
	}
}
