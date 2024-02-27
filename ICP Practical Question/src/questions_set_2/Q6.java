package questions_set_2;
/* 
 * Write a Java program to define a 1D Array and find all the elements which are smallest
 * than its left neighbour and greater than right neighbour
 *
 **/
import java.util.Scanner;

public class Q6 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the length of the array : ");
    int n = obj.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter " + n + " elements : ");
    for(int i = 0;i < n;i++) { 
      arr[i] = obj.nextInt();
    }

    for(int i = 1;i < n - 1;i++) { 
      if((arr[i - 1] > arr[i]) && (arr[i] > arr[i + 1])) { 
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();

    obj.close();
  }
}
