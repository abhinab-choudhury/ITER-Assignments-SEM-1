package semester_1.programming_assignment_2.lab_assignment_cla;

public class A2Q7 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		boolean result = ((a * b) >= c) ? true : ((b * c) >= a) ? true : ((c * a) >= b) ? true : false;
		System.out.println(result);
	}
}
