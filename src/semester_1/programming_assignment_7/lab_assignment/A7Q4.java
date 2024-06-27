package semester_1.programming_assignment_7.lab_assignment;

import java.util.Scanner;

public class A7Q4 {
  public static double min(double[] array) { 
    int min_idx = 0;
    for(int i = 1;i < array.length;i++) { 
      if(array[min_idx] > array[i]) {
        min_idx = i;
      }
    }

    return array[min_idx];
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Enter the size of the Array : ");
    int N = obj.nextInt();
    double array[] = new double[N];
    System.out.println("Enter " + N + " element : ");
    for(int i = 0;i < N;i++) { 
      array[i] = obj.nextDouble();
    }

    System.out.println("smallest element in the array : " + min(array));

    obj.close();
  }
}
