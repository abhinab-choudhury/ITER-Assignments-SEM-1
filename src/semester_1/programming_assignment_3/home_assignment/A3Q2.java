package semester_1.programming_assignment_3.home_assignment;

import java.util.Scanner;

public class A3Q2 {
	public static void main(String[] args) {
		int day_n, day_f;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		day_n = obj.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		day_f = obj.nextInt();
		
		
		int cnt = 0;
		String begin = "Today is";
		while(cnt <= 1) {
			
			switch(day_n) {
				case 0:
					System.out.print( begin + " Sunday ");
					break;
				case 1:
					System.out.print( begin + " Monday ");
					break;
				case 2:
					System.out.print( begin + " Tuesday ");
					break;
				case 3:
					System.out.print( begin + " Wednesday ");
					break;
				case 4:
					System.out.print( begin + " Thursday ");
					break;
				case 5:
					System.out.print( begin + " Friday ");
					break;
				case 6:
					System.out.print( begin + " Saturday ");
					break;
				default:
					System.out.print("Wronng Choise.");
			}
			day_n = day_n + day_f; 
			day_n = (day_n % 7);
			begin = "the future day is";
			cnt++;
		}
		
		obj.close();
	}
}
