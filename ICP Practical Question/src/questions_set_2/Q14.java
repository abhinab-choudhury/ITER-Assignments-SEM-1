package questions_set_2;
/* 
 * Find all common prime divisors of two numbers using methods
 *
 **/
import java.util.Scanner;

public class Q14 {
  
  static boolean prime[] = new boolean[1000001];

  public static void findPrime() { 
    for(int i = 0;i < prime.length;i++) {
      prime[i] = true;
    }
    
    prime[0] = false; 
    prime[1] = false; 
    
    for(int i = 2;i * i < prime.length;i++) { 
      if(prime[i]) {
        for(int j = i * i;j < prime.length;j += i) {
          prime[j] = false;
        }
      }
    }

  }
  public static void commonPrime(int a, int b) {
    findPrime();
    System.out.println("Common Prime Factors of " + a + ", " + b + " : ");
    for(int i = 0;i < (int)Math.min(a, b);i++) { 
      if(prime[i] && ((a % i == 0) && (b % i == 0))) { 
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter two numbers : ");
    int a = obj.nextInt();
    int b = obj.nextInt();
    commonPrime(a, b);

    obj.close();
  }
}
