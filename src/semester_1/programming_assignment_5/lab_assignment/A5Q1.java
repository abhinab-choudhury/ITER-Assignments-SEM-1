package semester_1.programming_assignment_5.lab_assignment;

import java.util.Scanner;

public class A5Q1 {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first number: ");
		num1 = obj.nextInt();
		System.out.print("Enter second number: ");
		num2 = obj.nextInt();
		

		int sum1 = 0;
		for(int i = 1;i * i <= num1;i++) {
			if(num1 % i == 0) {
				if(i != num1 / i) {
					sum1 += i;
					sum1 += num1 / i;
				} else {
					sum1 += i;
				}
			}
		}
		sum1 -= num1;

		int sum2 = 0;
		for(int i = 1;i * i <= num2;i++) {
			if(num2 % i == 0) {
				if(i != num2 / i) {
					sum2 += i;
					sum2 += num2 / i;
				} else {
					sum2 += i;
				}
			}
		}
		sum2 -= num2;
		
		if((sum1 == num2) && (sum2 == num1)) {
			System.out.println(num1 + " and " + num2 + " are amicable numbers.");
		} else {
			System.out.println(num1 + " and " + num2 + " are not amicable numbers.");
		}
		obj.close();
	}
}
