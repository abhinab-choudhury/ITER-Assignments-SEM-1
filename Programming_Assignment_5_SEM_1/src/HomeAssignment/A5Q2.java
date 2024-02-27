package HomeAssignment;

import java.util.Scanner;

public class A5Q2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int N = 1 + (obj.nextInt() - 1) * 2;

    for(int i = 1;i <= N;i += 2) {
      for(int j = N;j >= i;j -= 2) {
        System.out.print("  ");
      }
      for(int j = 1;j <= i;j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    obj.close();
  }
}
