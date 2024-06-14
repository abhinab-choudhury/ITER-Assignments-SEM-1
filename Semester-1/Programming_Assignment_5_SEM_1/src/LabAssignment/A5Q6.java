package LabAssignment;

import java.util.Scanner;

public class A5Q6 {
  public static void main(String[] args) {
    int N;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter for N : ");
    N = obj.nextInt();

    System.out.println("\nPattern - 1");
    for(int i = 0;i < N;i++) {
      for(int j = 0;j <= i;j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  
    System.out.println("\nPattern - 2");
    for(int i = 1;i <= N;i++) {
      for(int j = 1;j <= i;j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }

    System.out.println("\nPattern - 3");
    for(int i = 0, k = 1;i < N;i++) {
      for(int j = 0;j <= i;j++, k++) {
        if(k < 10) {
          System.out.print(k + "  ");
        } else {
          System.out.print(k + " ");
        }
      }
      System.out.println();
    }

    System.out.println("\nPattern - 4");
    for(int i = 1;i <= N;i++) {
      for(int j = 1; j <= i;j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    obj.close();
  }
}
