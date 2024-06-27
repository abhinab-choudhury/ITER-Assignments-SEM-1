package semester_1.programming_assignment_2.lab_assignment_cla;

public class A2Q1 {
	public static void main(String[] args) {
		int dividend = Integer.parseInt(args[0]);
		int divisor = Integer.parseInt(args[1]);
		
		System.out.println("Quotient = " + (dividend / divisor) + "\nRemainder = " + (dividend % divisor));
	}
}
