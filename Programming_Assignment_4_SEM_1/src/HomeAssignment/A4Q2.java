package HomeAssignment;

import java.util.Scanner;

  public class A4Q2 {
  public static void main(String args[]) {
    int N, sum = 0; 
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter a Number : ");
    N = obj.nextInt();

    int i = 1;
    while(i < N) {
      if(i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
      i++;
    }

    System.out.println("The sum of all the multiples of 3 or 5 below " + N + " is : " + sum);
    obj.close();
  }
}
