package semester_1.programming_assignment_7.lab_assignment;

import java.util.Scanner;

public class A7Q7 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a number(Base - 10): ");
    int N = obj.nextInt();
    
    int octal_num = 0;

    int placeValue = 1;
    System.out.print("octal representation of " + N + " is ");
    while(N > 0) { 
      octal_num += (N % 8) * placeValue;
      N /= 8;
      placeValue *= 10;
    }
    System.out.println(octal_num);
    
    obj.close();
  }
}
