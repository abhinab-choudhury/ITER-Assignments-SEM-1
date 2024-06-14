package LabAssignment;

import java.util.Scanner;

public class A5Q9 {
  public static void main(String[] args) {
    int N;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a number : "); 
    N = obj.nextInt();
    
    float sum = 0.0f;
    for(int i = 1;i <= N;i++) {
      sum = sum + 1/(float)(i * i);
    }

    if(N > 4) {
      System.out.println("1/(1^2) + 1/(2^2) + 1/(3^2) + 1/(4^2) + ..... + 1/(" + N + "^2) : " + sum);
    } else {
      System.out.println("Sum of " + N + " in number is : " + sum);
    }
    obj.close();
  }
}
