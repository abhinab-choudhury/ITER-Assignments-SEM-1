package LabAssignment;

import java.util.Scanner;

public class A5Q2 {
	public static void main(String[] args) {
		int N, temp = 0;
		boolean flag = true;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		N = obj.nextInt();
		temp = N;


		for(int i = 2;i * i <= N;i++) {
			if(N % i == 0) {
				flag = false;
				break;
			}
		}

		if(flag == true) {
			int rev = 0;
			while(temp > 0) {
				rev = rev * 10 + (temp % 10);
				temp /= 10;
			}
			for(int i = 2;i * i <= rev;i++){
				if(rev % i == 0) {
					flag = false;
					break;
				}
			}
		} 

		if(flag == true){
			System.out.println(N + " is a twisted prime.");
		} else {
			System.out.println(N + " is not a twisted prime.");
		}
		
		obj.close();
	}

}
