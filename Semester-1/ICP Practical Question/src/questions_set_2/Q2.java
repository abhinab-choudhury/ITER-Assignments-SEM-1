package questions_set_2;
/* 
 * 
 * Write a java program to find the sum of series: 1! - 2! + 3! - 4! + 5! + .... + n!
 * where 'n' is a  positive integer and is given as input by the user.
 *
 **/
 import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter a number : ");
    int n = obj.nextInt();

    long sum = 0;
    int factorial = 1, sign = 1, i = 1;
    while(i <= n) { 
      sum += (sign) * factorial;
      i++;
      sign *= -1;
      factorial *= i;
    }
    
    System.out.println("Sum of the series : \n1! - 2! + 3! - 4! + 5! + .... + n! = " + sum);

    obj.close();
  }
}
