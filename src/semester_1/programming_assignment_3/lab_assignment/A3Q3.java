package semester_1.programming_assignment_3.lab_assignment;

import java.util.Scanner;

public class A3Q3 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int num1 = obj.nextInt();
		System.out.print("Input second number: ");
		int num2 = obj.nextInt();
		System.out.print("Input third number: ");
		int num3 = obj.nextInt();
		
		if(num1 <= num2) {
			if(num2 <= num3) {
				System.out.println("Increasing");
			} else {
				System.out.println("Neither Increasing nor decreasing");
			}
		} else if(num1 >= num2) {
			if(num2 >= num3) {
				System.out.println("Decreasing");
			} else {
				System.out.println("Neither Increasing nor decreasing");
			}
		} else {
			System.out.println("Neither Increasing nor decreasing");
		}
		obj.close();
	}
}
