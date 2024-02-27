package HomeAssignment;

import java.util.Scanner;

public class A6Q4 {
  public static int wordCnt(String str) {
    
    if(str == null || str.isEmpty()) {
      return 0;
    }
    
    int cnt = 1;
    str = str.trim();
    for(int i = 0;i < str.length();i++) {
      char c = str.charAt(i);
      if(Character.isSpace(c) == true) {
        cnt++;
      }
    }
    return cnt; 
  }
  public static void main(String[] args) {
    String str;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the String : ");
    str = obj.nextLine();

    System.out.println("Number of words in the string(" + str + "): " + wordCnt(str));

    obj.close();
  }
}
