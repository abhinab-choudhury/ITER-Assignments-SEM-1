package HomeAssignment_CLA;

public class A2Q3 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = (num / 1000) + (num % 10);
	
		System.out.println("Sum  first and last digit of " + num + " is " + sum);
	}
}
