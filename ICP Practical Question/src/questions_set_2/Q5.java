package questions_set_2;
/* 
 * Write a java program
 *  Enter a number : 5
 *  * * * * * 
 *  * * * *
 *  * * *
 *  * *
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 *
 **/
import java.util.Scanner;

public class Q5 {
  public static void invertedTri(int n) { 
    for(int i = 0;i < n;i++) {
      for(int j = 0;j <= n - i;j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for(int i = 1;i < n;i++) { 
      for(int j = 0 ;j <= i;j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int n = obj.nextInt();
    invertedTri(n);

    obj.close();
  }
}
