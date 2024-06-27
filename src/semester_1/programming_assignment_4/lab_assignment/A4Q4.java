package semester_1.programming_assignment_4.lab_assignment;

import java.util.Scanner;

public class A4Q4 {
	public static void main(String[] args) {
		int n1, n2, gcd;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		n1 = obj.nextInt();
		System.out.print("Enter the second number: ");
		n2 = obj.nextInt();
		
        int a = n1, b = n2;
        do{
            gcd = a % b;
            a = b;
            b = gcd;
        }while(a % b != 0);
		
		System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);
		
		obj.close();
	}
}
