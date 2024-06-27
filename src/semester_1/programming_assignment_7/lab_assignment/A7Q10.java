package semester_1.programming_assignment_7.lab_assignment;

import java.util.Scanner;

public class A7Q10 {
  public static int[] eliminateDuplicates(int arr[]) {
    int newsize = 0, len = arr.length;
    int temp[] = new int[len];

    for(int i = 0; i < len;i++) {
      boolean isDuplicate = false;

      for(int j = i + 1;j < len;j++) {
        if(arr[i] == arr[j]) {
          isDuplicate = true;
          break;
        }
      }

      if(!isDuplicate) { 
        temp[newsize] = arr[i];
        newsize++;
      }

    }

    int newarr[] = new int[newsize];
    for(int i = 0;i < newsize;i++) { 
      newarr[i] = temp[i];
    }

    return newarr;
  }

  public static void main(String args[]) {
    Scanner obj = new Scanner(System.in);
    
    int arr[] = new int[10];
    System.out.println("Enter ten numbers : ");
    for(int i = 0;i < 10;i++) {
      arr[i] = obj.nextInt();
    }

    arr = eliminateDuplicates(arr);
    System.out.println("Array after removing duplicate element : ");
    for(int element : arr) {
      System.out.print(element + " ");
    }
    System.out.println();


    obj.close();
  }
}
