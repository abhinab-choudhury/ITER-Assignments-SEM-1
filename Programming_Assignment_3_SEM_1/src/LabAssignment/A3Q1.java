package LabAssignment;

import java.util.Scanner;

public class A3Q1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your Age: ");
		int N = obj.nextInt();
		if(N >= 18) {
			System.out.println("You are eligible to cast your vote");
		} else {
			System.out.println("You are NOT eligible to cast your vote");
		}
		obj.close();
	}
}
