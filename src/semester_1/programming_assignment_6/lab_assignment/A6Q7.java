package semester_1.programming_assignment_6.lab_assignment;

import java.util.Scanner;

public class A6Q7 {
  public static int count(String str) {
    int vol_cnt = 0;
    for(int i = 0;i < str.length();i++) {
      char character = Character.toLowerCase(str.charAt(i));
      if( character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
        vol_cnt++;
      }
    }
    return vol_cnt;
  }
  public static void main(String[] args) {
    String str;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the String : ");
    str = obj.nextLine();
    str.toLowerCase();
    
    System.out.println("Count of Vowels : " + count(str));

    obj.close();
  }
}
