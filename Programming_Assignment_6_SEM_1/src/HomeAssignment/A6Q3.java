package HomeAssignment;

import java.util.Scanner;
public class A6Q3 {
  public static void main(String[] args) {
    String str;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the String : ");
    str = obj.next();
    
    System.out.println("The middle character in the string: " + str.charAt(str.length()/2));

    obj.close();
  }
}
