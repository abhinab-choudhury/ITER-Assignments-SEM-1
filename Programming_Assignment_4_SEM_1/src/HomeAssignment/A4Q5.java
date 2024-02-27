package HomeAssignment;

import java.util.Scanner;

public class A4Q5 {
  public static void main(String[] args) {
    int N;
    Scanner obj = new Scanner(System.in);
    System.out.print("N : ");
    N = obj.nextInt();

    String pres = "1";
    System.out.println(pres);
    for (int i = 2; i <= N; i++) {
      pres = pres + i + pres;
      System.out.println(pres);
    }
    obj.close();
  }
}
