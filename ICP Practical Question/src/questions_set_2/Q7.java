package questions_set_2;
/* 
 * Write a program to display the find the square of the reverse a number
 *  
 **/
import java.util.Scanner;

public class Q7 {
  public static int reverse(int n) {
    int rev = 0;
    while(n > 0) {
      rev = rev * 10 + (n % 10);
      n /= 10;
    }

    return rev;
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter a number : ");
    int n = obj.nextInt();
    int rev = reverse(n);
    System.out.println("Reverse of " + n + " is " + rev);
    System.out.println("Square of reverse of " + n + " is " + (rev * rev));

    obj.close();
  }
}
