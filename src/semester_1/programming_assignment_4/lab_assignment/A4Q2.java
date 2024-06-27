package semester_1.programming_assignment_4.lab_assignment;

import java.util.Scanner;

public class A4Q2 {
	public static void main(String[] args) {
		int n, sum = 0 ; 
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n = obj.nextInt();
		System.out.print("The number " + n + " is ");
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		
		if(sum % 9 == 0) { 
			System.out.println("divisible by 9.");
		} else {
			System.out.println("not divisible by 9.");
		}
		
		obj.close();
	}
}
