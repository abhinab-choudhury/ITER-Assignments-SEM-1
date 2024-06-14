package HomeAssignment_CLA;

public class A2Q2 {
	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]);
		double h = Double.parseDouble(args[1]);
		
		double SA = (Math.PI * Math.pow(r, 2)) + (2 * Math.PI * r * h);
		System.out.println("Surface Area : " + SA);
	}
}
