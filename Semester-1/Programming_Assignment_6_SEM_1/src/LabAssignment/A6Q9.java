package LabAssignment;

import java.util.Scanner;

public class A6Q9 {

  public static int num_cnt(String str) {
    int numCnt = 0;
    for (int i = 0; i < str.length(); i++) {
      char character = str.charAt(i);
      if(Character.isDigit(character)) {
        numCnt++;
      }
    }
    return numCnt;
  }
  
  public static boolean is_digit_letter(String str) {
    for(int i = 0;i < str.length();i++) {
      char character = str.charAt(i);
      if(!(Character.isDigit(character) == true || Character.isLetter(character) == true)) {
        return false;
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    String password;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the password : ");
    password = obj.next();
    
    if(password.length() >= 8) {
      if(is_digit_letter(password) == true) {
        if(num_cnt(password) >= 2) {
          System.out.println("Valid password");
        } else {
          System.out.println("Invalid password : password must be atleast 2 digits.");
        }
      } else {
        System.out.println("Invalid password : password must contain only digits and letters.");
      }
    } else {
      System.out.println("Invalid password : password must be atleast 8 character long.");
    }
    
    obj.close(); 
  }
}
