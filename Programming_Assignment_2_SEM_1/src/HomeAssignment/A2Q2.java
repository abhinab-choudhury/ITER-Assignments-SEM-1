 package HomeAssignment;

import java.util.Scanner;

public class A2Q2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number of Eggs : ");
		long eggs = obj.nextLong();
		long gross = eggs / 144;
		long dozen = (eggs - (gross * 144)) / 12;
		int rem = (int)(eggs - (gross * 144)) % 12;
		
		System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + rem);
		
		obj.close();
	}
}
