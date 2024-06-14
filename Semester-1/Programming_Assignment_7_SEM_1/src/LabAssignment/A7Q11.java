package LabAssignment;

import java.util.Scanner;

public class A7Q11 {

  public static void bubblesort(int arr[], int N) { 
    for(int i = 0;i < N - 1;i++) {
      for(int j = 1;j < N - i - 1;j++) { 
        if(arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Enter the size of array : ");
    int N = obj.nextInt();
    int arr[] = new int[N];
    System.out.println("Enter " + N + " elements : ");
    for(int i = 0;i < N;i++) { 
      arr[i] = obj.nextInt();
    }

    bubblesort(arr, N);

    for(int element : arr) {
      System.out.print(element + " ");
    }
    System.out.println();

    obj.close();
  }
}
