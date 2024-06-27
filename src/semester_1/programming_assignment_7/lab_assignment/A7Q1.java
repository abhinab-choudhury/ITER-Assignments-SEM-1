package semester_1.programming_assignment_7.lab_assignment;

import java.util.Scanner;

public class A7Q1 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter the size of the 1D Array : ");
    int sum = 0;
    int N = obj.nextInt(); 
    int arr[] = new int[N];
    
    for(int i = 0;i < N;i++) {
      arr[i] = (int)((Math.random() * N) + 1);
      System.out.print(arr[i] + " ");
      sum += arr[i];
    }

    System.out.println("\nsum : " + sum + "\naverage : " + (float)(sum/N));

    obj.close();
  }
}
