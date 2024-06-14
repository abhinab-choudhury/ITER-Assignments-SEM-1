package LabAssignment_CLA;

public class A2Q3 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int num1, num2;
		if(a <= b) {
			num1 = (int)((b - a) * Math.random()) + a;
			num2 = (int)((b - a) * Math.random()) + a;
		} else {
			num1 = (int)((a - b) * Math.random()) + b;
			num2 = (int)((a - b) * Math.random()) + b;
		}
		System.out.println("Number 1 : " + num1 + "\nNumber 2 : " + num2);
		System.out.println("Sum of two random numbers : " + (num1 + num2));
	}
}
