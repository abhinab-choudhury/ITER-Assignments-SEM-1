package semester_1.programming_assignment_6.lab_assignment;

import java.util.Scanner;

public class A6Q2 {
  public static long getPentagonalNumber(int N) {
    long num = N * ((3 * N) - 1) / 2;
    return num;
  }
  public static void main(String[] args) {
    int N = 100;
    Scanner obj = new Scanner(System.in);
    
    for(int i = 1;i <= N;i++) {
      if(i % 10 == 0) {
        System.out.println(getPentagonalNumber(i));
      }
      System.out.print(getPentagonalNumber(i) + " ");
    }
    
    obj.close();
  }

}
