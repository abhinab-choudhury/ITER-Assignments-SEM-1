package semester_1.programming_assignment_5.lab_assignment;

import java.util.Scanner;

public class A5Q4 {
  public static void main(String[] args) {
    int m, n;
		
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the value of m: ");		
    m = obj.nextInt();
    System.out.print("Enter the value of n: "); 
    n = obj.nextInt();
    int temp = m;

    long factorial = 1;
    while(temp >= 1) {
      factorial *= temp;
      temp--;
    }
    System.out.println("Factorial of " + m +" is: " + factorial);
    
    for(int i = m + 1; i <= n;i++){
      factorial *= i;
      System.out.println("Factorial of " + i +" is: " + factorial);
    }

    obj.close();
  }
}
