package semester_1.programming_assignment_6.lab_assignment;

import java.util.Scanner;

public class A6Q4 {
  public static int numberOfDaysInAYear(int Year) {
    boolean isLeap = false;
    if(((Year % 4 == 0) && (Year % 100 != 0)) || (Year % 400 == 0) ) {
      isLeap = true;
    }

    return ((isLeap == true) ? 366 : 365);
  }

  public static void main(String[] args) {
    int y1, y2;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter a Year (1928 - 1988) ");
    System.out.print("Year 1 : ");
    y1 = obj.nextInt();
    System.out.print("Year 2 : ");
    y2 = obj.nextInt();
    
    for(int i = y1;i <= y2;i++) {
      System.out.println("No of Days in Year(" + i + ") : " + numberOfDaysInAYear(i));
    }

    obj.close();
  }
}
