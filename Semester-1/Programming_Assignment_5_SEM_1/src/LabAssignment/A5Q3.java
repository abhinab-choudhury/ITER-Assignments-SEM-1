package LabAssignment;

import java.util.Scanner;

public class A5Q3 {
  public static void main(String[] args) {
    int num1, num2;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first number: ");
		num1 = obj.nextInt();
		System.out.print("Enter second number: ");
		num2 = obj.nextInt();
		
    System.out.println("Prime numbers between " + num1 + " and "+ num2 + " are: ");
    for(int i = num1 + 1;i < num2;i++) {
      boolean flag = true;
      for(int j = 2;j * j <= i;j++) {
        if(i % j == 0) {
          flag = false;
          break;
        }
      }
      
      if(flag == true) {
        System.out.print(i + " ");
      }
    }
    System.out.println();

    obj.close();
  }
}
