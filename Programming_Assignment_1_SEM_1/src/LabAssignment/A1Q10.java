package LabAssignment;

public class A1Q10 {

	public static void main(String[] args) {
		
		String s1 = "1", s2 , s3, s4;
		System.out.println(s1);
		s2 = s1 + 2 + s1;
		System.out.println(s2);
		s3 = s2 + 3 + s2;
		System.out.println(s3);
		s4 = s3 + 4 + s3;
		System.out.println(s4);
		
		/* Alternate Method : S
			String s1 = "";
			for(int i = 1;i <= 4;i++) {
				s1 = s1 + i + s1;
				System.out.println(s1);
			}
		*/
	}

}
