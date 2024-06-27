package semester_1.programming_assignment_6.home_assignment;

import java.util.Scanner;

public class A6Q5 {
  public static void main(String[] args) {
    int N, sum = 0; 
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Enter the first number : ");
    N = obj.nextInt();
    sum += N;
    System.out.print("Enter the second number : ");
    N = obj.nextInt();
    sum += N;
    System.out.print("Enter the third number : ");
    N = obj.nextInt();
    sum += N;

    System.out.println("Check whether the three said numbers are consecutive or not!");
    if(sum == ((3 * N) - 3)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}
