package LabAssignment;

import java.util.Scanner;

public class A1Q6 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter you Name : ");
		String name = obj.nextLine();
		System.out.print("Enter you Account Number : ");
		String account_no = obj.next();
		System.out.print("Enter you bank Balance : ");
		String balance = obj.next();
		
		System.out.println("My name is " + name + " bearing account number " + account_no + " having a balance " + balance);
		obj.close();

	}

}
