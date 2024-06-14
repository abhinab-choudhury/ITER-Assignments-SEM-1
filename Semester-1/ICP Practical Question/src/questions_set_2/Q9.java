package questions_set_2;
/* 
 * Write a program to display : (1 + 1/2 + 1/3 + 1/4 + ...... + 1/n)
 *
 **/
import java.util.Scanner;

public class Q9 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = obj.nextInt();

    float sum = 0;
    for(int i = 1;i <= n;i++) {
      sum += 1.0f/i;
    }
    System.out.println("1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n = " + sum);
    obj.close();
  }
}
