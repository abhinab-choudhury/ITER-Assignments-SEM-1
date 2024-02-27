package LabAssignment;

import java.util.Scanner;

public class A3Q6 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("========== Monthly Electricity Bill Calculator ==========");
		System.out.print("Enter the number of Units : ");
		int N = obj.nextInt();
		float price = 0;
		if(N >=0 && N <= 50) {
			price = 3.0f * N; 
		}else if(N > 50 && N <= 200) {
			price = (3.0f * 50) + ((N - 50) * 4.8f);
		}else if(N > 200 && N <= 400) {
			price = (3.0f * 50) + (150 * 4.8f) + ((N - 200) * 5.8f);
		}else if(N >= 400) {
			price = (3.0f * 50) + (150 * 4.8f) + (200 * 5.8f) + ((N - 400) * 6.2f);
		} else {
			System.out.println("Something went Wrong.");
		}
		
		System.out.println("Your Electricity Bill is : " + price + " Rs");
		obj.close();
		
	}
}
