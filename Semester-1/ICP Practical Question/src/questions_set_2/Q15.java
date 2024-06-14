package questions_set_2;
/* 
 * Write a program to print the pattern using nested for loop
 *  Enter a number : 4
 *     A
 *    B B
 *   C C C
 *  D D D D
 **/
import java.util.Scanner;

public class Q15 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = obj.nextInt();

    for(int i = 65;i < 65 + n;i++) {
      for(int j = i;j < 65 + n - 1;j++) {
        System.out.print(" ");
      }
      for(int j = 65;j <= i;j++){
        System.out.print((char)i + " ");
      }
      System.out.println();
    }
    obj.close();
  }
}
