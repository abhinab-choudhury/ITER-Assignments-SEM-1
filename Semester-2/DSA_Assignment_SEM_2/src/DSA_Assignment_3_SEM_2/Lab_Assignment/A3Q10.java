package DSA_Assignment_3_SEM_2.Lab_Assignment;

import java.util.Scanner;

public class A3Q10 {
  public static int Fibonacci(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }

    return Fibonacci(n - 1) + Fibonacci(n - 2);
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("n: ");
    int n = obj.nextInt();
    System.out.println("nth fibonacci number : " + Fibonacci(n));
    obj.close();
  }
}
