package questions_set_2;
/*
 * Write a Java program to define a method to check whether two nubmers are co-prime or not. 
 * (29,31),(36,49) -> co-prime as the GCD is 1
 *
 * Function Signature : 
 * public static boolean Coprime(int x, int y)
 *
 * */
import java.util.Scanner;

public class Q4 {
 
  public static boolean Coprime(int a, int b){
    while(b != 0) { 
      int gcd = a % b;
      a = b;
      b = gcd;
    }

    if(a == 1) {
      return true;
    }

    return false;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int x = obj.nextInt();
    int y = obj.nextInt();

    if(Coprime(x, y)) { 
      System.out.println(x + " and " + y + " are co-prime numbers.");
    } else {
      System.out.println(x + " and " + y + " are NOT co-prime numbers.");
    }
    obj.close();
  }
}
