package LabAssignment;

import java.util.Scanner;

public class A3Q5 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Input tzhe year: ");
		int y = obj.nextInt();
		
		if((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0))) {
			System.out.println( y + " is a leap year: true");
		} else {
			System.out.println( y + " is a leap year: false");
		}
		
		obj.close();
	}
}
