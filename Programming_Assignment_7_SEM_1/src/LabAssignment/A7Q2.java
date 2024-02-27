package LabAssignment;

import java.util.Scanner;

public class A7Q2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    int arr[] = new int[10000];

    System.out.print("Enter the integers between 1 and 100: ");
    while(true) {
      int temp = obj.nextInt();
      if(!(temp > 0 && temp <= 100)) { 
        break;
      }
      arr[temp]++;
    }
    
    for(int i = 0;i < arr.length;i++) { 
      if(arr[i] > 0) { 
        System.out.println(i + " occurs " + arr[i] + (arr[i] > 1?" times":" time"));
      }
    }
    
    obj.close();
  }
}
