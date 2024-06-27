package semester_1.practical_question.questions_set_2;
/* 
 *  Write a java program where method called checkPalindrome that accepts a number as 
 *  input and return True or False depending on whether it is a palindrome or not.
 *
 **/
import java.util.Scanner;

public class Q10 {
  public static boolean checkPalindrome(int n) { 
    int t = n;
    int rev = 0;
    while(n > 0) {
      rev = rev * 10 + (n % 10);
      n /= 10;
    }

    if(rev == t) { 
      return true;
    }

    return false;
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Enter a number : ");
    int n = obj.nextInt();

    if(checkPalindrome(n)) {
      System.out.println("Yes, It's a Palindrome Number.");
    } else {
      System.out.println("No, It's NOT a Palindrome Number.");
    }

    obj.close();
  }
}
