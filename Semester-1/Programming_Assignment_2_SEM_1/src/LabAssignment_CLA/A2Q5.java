package LabAssignment_CLA;

public class A2Q5 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int maxi = Math.max(a, Math.max(b, c));
		int mini = Math.min(a, Math.min(b, c));
		int mid = (a != maxi && a != mini) ? a : (b != maxi && b != mini) ? b : (c != maxi && c != mini) ? c : -241241341;

		System.out.println(mini + ", " + mid + ", " + maxi);

	}
}
