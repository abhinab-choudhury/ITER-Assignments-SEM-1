package semester_1.programming_assignment_6.home_assignment;

import java.util.Scanner;
public class A6Q1 {
  public static boolean isRepeat(int idx, String str) {
    if((str.indexOf(str.charAt(idx), str.indexOf(str.charAt(idx)) + 1) == -1)) {
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    String str;
    
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the String : ");
    str = obj.next();
  
    for(int i = 0;i < str.length();i++) {
      if(isRepeat(i, str) == true) {
        System.out.println("The First Non-repeating Character is : " + str.charAt(i));
        return;
      }
    }
    System.out.println("There is no Non-repeating Character in the given string.");

    obj.close();
  }
}
