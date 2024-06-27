package semester_1.programming_assignment_7.lab_assignment;

import java.util.Scanner;

public class A7Q12 {
  public static void selectionsort(int arr[]) {
    for(int i = 0;i < arr.length - 1;i++) {
      int min_idx = i;
      for(int j = i + 1;j < arr.length;j++) { 
        if(arr[j] < arr[min_idx]) {
          min_idx = j;
        }
      }

      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
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

    selectionsort(arr);

    for(int element : arr) {
      System.out.print(element + " ");
    }
    System.out.println();
    
    obj.close();
  }
}
