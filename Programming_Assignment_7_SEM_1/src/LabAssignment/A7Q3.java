package LabAssignment;

import java.util.Scanner;

public class A7Q3 {

  public static int searchCount(int arr[], int k) { 
    int cnt = 0;
    for(int i = 0;i < arr.length;i++) { 
      if(arr[i] == k) {
        cnt++;
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int arr[] = new int[10];
    int k;

    System.out.print("Enter 10 number : ");;
    for(int i = 0;i < 10;i++) { 
      arr[i] = obj.nextInt();
    }
    System.out.print("Enter the search element : ");
    k = obj.nextInt();

    int count = searchCount(arr, k);
    if(count == 0) { 
      System.out.println("Element Not Found...");
    } else {
      System.out.println("count of search element : " +  count);
    }

    obj.close();
  }
}
