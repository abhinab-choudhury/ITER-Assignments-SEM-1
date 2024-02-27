package LabAssignment;

import java.util.Scanner;

public class A5Q7 {
  public static void main(String[] args) {
    int N;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter for N : ");
    N = obj.nextInt();

    System.out.println("\nPattern - 1");
    for(int i = 0;i < N;i++) {
      for(int j = 0,k = 65;j <= i;j++,k++) {
        System.out.print((char)k + " ");
      }
      System.out.println();
    }
    System.out.println("\nPattern - 2");
    for(int i = N;i >= 1;i--) {
      for(int j = 1;j <= i;j++) {
        System.out.print("$ ");
      }
      System.out.println();
    }

    System.out.println("\nPattern - 3");
    for(int i = 1; i <= N;i++) {
      for(int j = 1;j <= N - i;j++) {
        System.out.print("  ");
      }
      for(int j = 1;j <= i;j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    obj.close();
  }
}
