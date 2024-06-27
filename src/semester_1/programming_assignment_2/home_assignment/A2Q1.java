package semester_1.programming_assignment_2.home_assignment;

import java.util.Scanner;

public class A2Q1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		
		long minutes = obj.nextLong();
		long days = minutes/(24 * 60);
		long years = days / 365;
		days = days - (365 * years);
		int min = (int)minutes % (24 * 60);
		
		System.out.println(minutes + "  minutes is approximately " + years + " years " + days + " days and " + min + " minutes");
		
		obj.close();
	}
}
