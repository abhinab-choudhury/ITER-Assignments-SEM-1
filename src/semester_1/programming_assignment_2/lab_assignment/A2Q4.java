package semester_1.programming_assignment_2.lab_assignment;

import java.util.Scanner;

public class A2Q4 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int N = obj.nextInt();
		int sum = 0;
		int rem;
		
		rem = N % 10;
		sum = sum + rem;
		N = N / 10;
		rem = N % 10;
		sum = sum + rem;
		N = N / 10;
		rem = N % 10;
		sum = sum + rem;
		N = N / 10;
		
		System.out.println("The sum of the digits is : " + sum);
		
		obj.close();
	}
}
