package semester_1.programming_assignment_2.lab_assignment;

import java.util.Scanner;

public class A2Q3 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter basic salary: ");
		double BS = obj.nextDouble();
		double DA = 0.4 * BS;
		double HRA = 0.2 * BS;
		double GS = BS + DA + HRA;
		System.out.println("DA is " + DA);
		System.out.println("HRA is " + HRA);
		System.out.println("Gross salary is " + GS);
		
		obj.close();
	}
}
