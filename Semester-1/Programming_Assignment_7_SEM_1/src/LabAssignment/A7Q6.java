package LabAssignment;

import java.util.Scanner;

public class A7Q6 {

  public static void reverse(int array[]) {
    int i = 0,j = array.length - 1;
    while(i < j) { 
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;

      i++;
      j--;
    }
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter the size of the array : ");
    int N = obj.nextInt();
    int arr[] = new int[N];
    System.out.println("Enter " + N + " elements : ");
    for(int i = 0;i < N;i++) { 
      arr[i] = obj.nextInt();
    }

    reverse(arr);

    for(int i = 0;i < arr.length;i++) {
      System.out.print(arr[i] + " ");
    }
    obj.close();
  }
}
