package semester_1.practical_question.questions_set_2;
/* 
 * Write a program to display the multiplication table of prime numbers from 1 to 100
 *
 **/
import java.util.Scanner;

public class Q8 {
  public static boolean isprime(int n) {
    for(int i = 2;i < n;i++) {
      if(n % i == 0) {
        return false;
      }
    }
    return true;  
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    for(int i = 1;i <= 100;i++) { 
      if(isprime(i)) { 
        System.out.println("Multiplication Table : " + i);
        for(int j = 1;j <= 10;j++) { 
          System.out.println(i + " * " + j + " = " + (i * j));
        }
      }
    }
    obj.close();
  }
}
