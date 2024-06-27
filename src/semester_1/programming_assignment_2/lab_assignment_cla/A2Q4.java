package semester_1.programming_assignment_2.lab_assignment_cla;

public class A2Q4 {
	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);

		double result = Math.cos(5 * t) + Math.sin(7 * t);
		System.out.println("Result of cos(5t) + sin(7t) for t = " + t + " : " + result);
	}
}
