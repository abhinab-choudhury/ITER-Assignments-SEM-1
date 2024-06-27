package semester_1.programming_assignment_1.lab_assignment;

import java.util.Scanner;

public class A1Q8 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the value of X : ");
		int X = scan.nextInt();
		System.out.print("Enter the value of Y : ");
		int Y = scan.nextInt();

		System.out.println("Before Swaping :\nX : " + X + "\nY : " + Y);

		// Logic(+,-)
		X = X + Y;
		Y = X - Y;
		X = X - Y;
		// Logic(*, /)
		/*
		 * X = X * Y;
		 * Y = X / Y;
		 * X = X / Y;
		 * */

		System.out.println("After Swaping :\nX : " + X + "\nY : " + Y);

		scan.close();
	}
}
