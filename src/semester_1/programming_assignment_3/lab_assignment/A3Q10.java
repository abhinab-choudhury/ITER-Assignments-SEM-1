package semester_1.programming_assignment_3.lab_assignment;

import java.util.Scanner;

public class A3Q10 {
	public static void main(String[] args) {
		float marks;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Your Marks : ");
		marks = obj.nextFloat();
		
		int rem = (int)(marks / 10);
		switch(rem) {
			case 10:
			case 9: {
				System.out.println("Grade : O");
				break;
			}
			case 8: {
				System.out.println("Grade : A");
				break;
			}
			case 7: {
				System.out.println("Grade : B");
				break;
			}
			case 6: {
				System.out.println("Grade : C");
				break;
			}
			case 5: {
				System.out.println("Grade : D");
				break;
			}
			case 4: {
				System.out.println("Grade : E");
				break;
			}
			case 3:
			case 2:
			case 1: {
				System.out.println("Grade : F");
				break;
			}
			default:
				System.out.println("Enter you Marks Between 0 to 100");
		}
		
		obj.close();
	}
}
