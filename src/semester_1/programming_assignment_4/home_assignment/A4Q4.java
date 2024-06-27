package semester_1.programming_assignment_4.home_assignment;

import java.util.Scanner;

public class A4Q4 {
  public static void main(String[] args) {
    int N, result = 0;
  
    Scanner obj = new Scanner(System.in);

    System.out.print("N : ");
    N = obj.nextInt();

    System.out.print("Sum of all even numbers : ");
    for (int i = 1; i <= N; i++) {
      if (i % 2 == 0) {
        result += i;
        if ((i + 2) > N) {
          System.out.print(i + " = ");
        } else {
          System.out.print(i + " + ");
        }
      }
    }
    System.out.println(result);

    result = 1;
    System.out.print("Product of all odd numbers : ");
    for (int i = 1; i <= N; i++) {
      if (i % 2 != 0) {
        result *= i;
        if ((i + 2) > N) {
          System.out.print(i + " = ");
        } else {
          System.out.print(i + " * ");
        }
      }
    }
    System.out.println(result);
    obj.close();
  }
}
