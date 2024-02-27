package LabAssignment;

import java.util.Scanner;

public class A2Q2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the distance in km = ");
		double distance = obj.nextDouble();
		double meters = distance * 1000;
		double feets = distance * 3280.8399;
		double inches = distance * 39370.0787;
		double centimeters = distance * 100000;
		
		System.out.println(distance + " km is " + meters + " meters");
		System.out.println(distance + " km is " + feets + " feet");
		System.out.println(distance + " km is " + inches + " inch");
		System.out.println(distance + " km is " + centimeters + " centimeters");
		
		obj.close();
	}
}
