package HomeAssignment;

import java.util.Scanner;

public class A5Q1 {
    public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int N = obj.nextInt();
        for(int i = 1;i <= N;i++) {
            for(int j = N;j >= 1;j--) {
                if(i == j) {
                   System.out.print("* ");
                } else {
                  System.out.print(j + " ");
                }
	     }
             System.out.println();
        }
       obj.close();
  }
}
