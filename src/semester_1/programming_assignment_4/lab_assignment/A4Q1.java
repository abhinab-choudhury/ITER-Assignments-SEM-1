package semester_1.programming_assignment_4.lab_assignment;

import java.util.Scanner;

public class A4Q1 {
	public static void main(String[] args) {
		int num1, num2, num3, sum = 0;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		num1 = obj.nextInt();
		System.out.print("Enter Second Number : ");
		num2 = obj.nextInt();
		System.out.print("Enter Third Number:  ");
		num3 = obj.nextInt();
		
		while(num1 <= num2) {
			System.out.print(num1 + " ");
			sum += num1;
			num1 += num3;
		}
		
		System.out.println("\nThe sum of number displayed is " + sum);
		
		obj.close();
	}
}
