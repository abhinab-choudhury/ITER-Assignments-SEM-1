package semester_1.programming_assignment_5.home_assignment;

import java.util.Scanner;

public class A5Q5 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = obj.nextInt();

    System.out.print("Fibonacci Series is: 0 1 ");
    if(n > 2) {
      int a = 0, b = 1;
      n -= 2;
      while(n-- > 0) {
        int c = a + b;
        a = b;
        b = c;
        System.out.print(c + " ");
      }
      System.out.println();
    } else {
      System.out.println("Enter a number greater than 2");
    }
    obj.close();
  }
}
