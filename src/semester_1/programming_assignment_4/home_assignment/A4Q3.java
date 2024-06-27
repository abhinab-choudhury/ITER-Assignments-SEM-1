package semester_1.programming_assignment_4.home_assignment;

import java.util.Scanner;

public class A4Q3 {
  public static void main(String args[]) {
    int l, r; 
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Left Range : ");
    l = obj.nextInt();
    System.out.print("Enter the Right Range : ");
    r = obj.nextInt();
    
    for(int i = l + 1;i <= r;i++) {
      if((i) % 5 == 0 || (i) % 10 == 0) {
          System.out.println(i);
          continue;
      }
      System.out.print(i + " ");
    }

    obj.close();
  }
}
