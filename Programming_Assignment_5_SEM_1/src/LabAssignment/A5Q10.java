package LabAssignment;

import java.util.Scanner;

public class A5Q10 {
  public static void main(String[] args) {
    int N;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    N = obj.nextInt();
    int a = 0, b = 1, c = 1;

    if(N > 3) {
      N -= 3;
      System.out.print("0 1 1 ");
      while(N-- > 0) {
        int sum = 0;
        sum += a + b + c;
        a = b;
        b = c;
        c = sum;
        System.out.print(sum + " ");
      }
      System.out.println();
    } else {
      System.out.println("Enter a number greater than 3");
    }
    obj.close();
  }
}
