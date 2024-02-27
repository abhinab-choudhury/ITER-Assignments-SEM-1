package LabAssignment;

import java.util.Scanner;

public class A7Q5 {

  public static int secondLargest(int array[]) { 
    int idx = 0,max_idx = 0;
    for(int i = 1;i < array.length;i++) { 
      if(array[max_idx] < array[i]) { 
        idx = max_idx;
        max_idx = i;
      }
      if((array[idx] < array[i]) && (array[max_idx] > array[i])) { 
        idx = i;
      }
    }

    return array[idx]; 
  }
  public static void main(String[] args) {
    
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter the size of array : ");
    int N = obj.nextInt();
    int array[] = new int[N];
    System.out.println("Enter " + N + " elements in the array : ");
    for(int i = 0;i < N;i++) {
      array[i] = obj.nextInt();
    }
    
    System.out.println("second largest element in the array : " + secondLargest(array));
    obj.close();
  }
}
