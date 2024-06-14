package LabAssignment;

import java.util.Scanner;

public class A2Q7 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a = 1, b = 2;
		System.out.println("a \t b \t pow(a, b)");
		System.out.println("--------------------------");
		System.out.println(a + " \t " + b + " \t " + (int)Math.pow(a,b));
		a++; b++;
		System.out.println(a + " \t " + b + " \t " + (int)Math.pow(a,b));
		a++; b++;
		System.out.println(a + " \t " + b + " \t " + (int)Math.pow(a,b));
		a++; b++;
		System.out.println(a + " \t " + b + " \t " + (int)Math.pow(a,b));
		a++; b++;
		System.out.println(a + " \t " + b + " \t " + (int)Math.pow(a,b));
		
		obj.close();
		
	}
}
