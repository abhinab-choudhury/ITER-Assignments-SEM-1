package LabAssignment;

import java.util.Scanner;

public class A5Q8 {
  public static void main(String[] args) {
    int N; 
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a number : "); 
    N = obj.nextInt();

    int sum = 0;
    for(int i = 1;i <= N;i++) {
      int temp = 0;
      for(int j = 1;j <= i;j++) {
        temp += j;
      }
      sum += temp;
    }
    if(N > 4) {
      System.out.println("1 + (1 + 2) + (1 + 2 + 3) ..... + (1 + 2 + 3 + .... + " + N + " ) : " + sum);
    } else {
      System.out.println("Sum of " + N + " number in : " + sum);
    }

    obj.close();
  }
}
