package semester_1.programming_assignment_6.lab_assignment;

import java.util.Scanner;

public class A6Q8 {
  public static String reverse(String str) {
    String revStr = "";

    for(int i = 0;i < str.length();i++) {
      revStr = str.charAt(i) + revStr;
    }

    return revStr;
  }
  public static boolean isPalindrome(String str) {
    String reverse_string = reverse(str);
    
    if(str.equals(reverse_string)) {
      return true;
    }    
    
    return false;
  }
  public static void main(String[] args) {
    String str;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the String : ");
    str = obj.nextLine();

    if(isPalindrome(str) == true) {
      System.out.println("Yes, " + str + " is a Palindrome String.");
    } else {
      System.out.println("No, " + str + " is NOT a Palindrome String.");
    }

    obj.close();
  }
}
