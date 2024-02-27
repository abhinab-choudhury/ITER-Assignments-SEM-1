package LabAssignment;

import java.util.Scanner;

public class A4Q3 {
	public static void main(String[] args) {
		int n, sum = 0;
		double avg;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = obj.nextInt();
		
		int t = n;
		
		System.out.print("Random numbers generated are: ");
		while(n > 0) {
			int random_num = (int)(1 + (Math.random() * n));
			System.out.print(random_num + " ");
			sum += random_num;
			n--;
		}
		
		avg = sum/t;
	
		System.out.println("\nAverage of " + t + " random numbers are " + avg);
				 
		obj.close();
	}
}
