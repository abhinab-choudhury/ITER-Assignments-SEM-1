package LabAssignment;

import java.util.Scanner;

public class A6Q6 {
  public static void main(String[] args) {
    String str, ch;

    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the String : ");
    str = obj.nextLine();
    System.out.print("Enter the Special Character which you want to search in the above string : " );
    ch = obj.next().charAt(0) + "";
    
    int cnt = 0;
    for(int i = 0;i < str.length();i++) {
      if((str.charAt(i) + "").equalsIgnoreCase(ch)) {
        cnt++;
      }
    }
    System.out.println("Count of \'"+ ch + "\' in \'" + str + "\' : " + cnt);

    obj.close();
  }
}
