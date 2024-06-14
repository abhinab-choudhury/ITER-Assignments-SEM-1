package LabAssignment;

import java.util.Scanner;

public class A2Q1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit : ");
		float Fahrenheit = obj.nextFloat();
		float Celsius = (float)((Fahrenheit - 32) * (5.0/9));
		System.out.println(Fahrenheit + " Fahrenheit is " + Celsius + " Celsius");
		
		obj.close();
	}
}
