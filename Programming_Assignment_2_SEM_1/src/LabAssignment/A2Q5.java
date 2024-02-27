package LabAssignment;

import java.util.Scanner;

public class A2Q5 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the radius of the hemisphere : ");
		double r = obj.nextDouble();
		double SA = 3 * Math.PI * Math.pow(r, 2);
		double V = (2.0/3) * Math.pow(r, 3);
		
		System.out.println("The surface area of the hemisphere is " + SA);
		System.out.println("The volume area of the hemisphere is " + V);
		
		obj.close();
	}
}
