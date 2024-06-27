package semester_1.programming_assignment_2.lab_assignment;

import java.util.Scanner;

public class A2Q6 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		
		System.out.print("Enter the number of seconds : ");
		double time = obj.nextDouble();
		double distance = (1.0/2) * 32.174 * Math.pow(time, 2);
		System.out.println("Distance travelled: " + distance);
		
		obj.close();
	}

}
