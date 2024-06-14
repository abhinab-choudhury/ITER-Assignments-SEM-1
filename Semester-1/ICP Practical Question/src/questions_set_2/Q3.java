package questions_set_2;
/*
 * Write a program to take a number as a input and check whether Krishnamurthy 
 * number or not.
 * 
 * Armstrong Number : 145 : 1! + 4! + 5!
 *
 * */
import java.util.Scanner;

public class Q3 {
  static int fact[] = new int[10];
  public static void factorial() {
    fact[0] = 1;
    for(int i = 1;i < 10;i++) { 
      fact[i] =  fact[i - 1] * i;
    }
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = obj.nextInt();
    
    int sum = 0,t = n;
    factorial();
    while(n > 0) { 
      sum += fact[n % 10];
      n /= 10;
    }

    if(sum == t) { 
      System.out.println("Yes, It is a Krishnamurthy Number");
    } else {
      System.out.println("No, It's NOT a Krishnamurthy Number");
    }

    obj.close();
  }
}

