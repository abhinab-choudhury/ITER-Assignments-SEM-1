package LabAssignment;

public class A1Q3 {
	public static void main(String[] args) {
		for(int i = 1;i <= 7;i++) {
			for(int j = 1;j <= 20;j++) {
				if(i == 1 || i == 7 || j == 1 || j == 20) {
					System.out.print("##");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
