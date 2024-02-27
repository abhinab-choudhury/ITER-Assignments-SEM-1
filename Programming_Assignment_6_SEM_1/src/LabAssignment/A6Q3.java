package LabAssignment;

import java.util.Scanner;

public class A6Q3 {
  public static long reverse(long N) {
    long rev = 0;
    while(N > 0) { 
      rev = (rev * 10) + (N % 10);
      N /= 10;
    }
    
    return rev;
  }
  public static boolean isPalindrome(long N) {
    if(N == reverse(N)) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    long N;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    N = obj.nextLong();

    if(isPalindrome(N) == true) {
      System.out.println("Yes, " + N + " is Palindrome.");
    } else { 
      System.out.println("No, " + N + " is Palindrome.");
    }
    
    obj.close();
  }
}
