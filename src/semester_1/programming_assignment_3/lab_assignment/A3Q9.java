package semester_1.programming_assignment_3.lab_assignment;

import java.util.Scanner;

public class A3Q9 {
	public static void main(String[] args) {
		int a, b, c, largest = 0, second_largest = 0;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the value of a, b, c : ");
		a = obj.nextInt();
		b = obj.nextInt();
		c = obj.nextInt();
		
		if(a >= b) {
			if(a >= c) {
				largest = a;
				if(b >= c) {
					second_largest = b;
				} else {
					second_largest = c;
				}
			}
		} 
		if(b >= a) {
			if(b >= c) {
				largest = b;
				if(a >= c) {
					second_largest = a;
				} else {
					second_largest = c;
				}
			}
		}
		if(c >= a) {
			if(c >= b) {
				largest = c;
				if(a >= b) {
					second_largest = a;
				} else {
					second_largest = b;
				}
			}
		} 
		
		System.out.println(a + ", " + b + ", " + c);
		System.out.println("Largest number: " + largest);
		System.out.println("2nd largest number: " + second_largest);
		
		obj.close();
	}
}
