package semester_1.programming_assignment_4.home_assignment;

import java.util.Scanner;

public class A4Q1 {
	public static void main(String args[]) {
		long N, t, sq_sum = 0,sum = 0;

		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		N = obj.nextInt();

		t = N;
		while(N > 0) {
			sum += N;
			sq_sum += (N * N);
			N--;
		}
		sum *= sum;

		System.out.println("The sum of the squares of the first " + t + " natural numbers is: " + sq_sum);
		System.out.println("The square of the sum of the first " + t + " natural numbers is: " + sum);
		System.out.println("Hence the difference between the sum of the squares of the first " + t + " natural numbers and the square of the sum is " + sum + " - " + sq_sum + " = " + (sum - sq_sum));

		obj.close();
	}
}
