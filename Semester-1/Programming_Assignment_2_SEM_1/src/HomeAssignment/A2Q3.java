package HomeAssignment;

import java.util.Scanner;

public class A2Q3 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the coordinates of three points for the Triangle : " );
		float p1 = obj.nextFloat();
		float p2 = obj.nextFloat();
		float q1 = obj.nextFloat();
		float q2 = obj.nextFloat();
		float r1 = obj.nextFloat();
		float r2 = obj.nextFloat();
		
		float a = (float)Math.sqrt(Math.pow((p1 - q1),2) + Math.pow((p2 - q2), 2));
		float b = (float)Math.sqrt(Math.pow((q1 - r1),2) + Math.pow((q2 - r2), 2));
		float c = (float)Math.sqrt(Math.pow((r1 - p1),2) + Math.pow((r2 - p2), 2));
	
		float s = (a + b + c)/2;
		float area = (float)Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
		
		System.out.println("The area of the triangle is " + area);
		
		obj.close();
	}
}
