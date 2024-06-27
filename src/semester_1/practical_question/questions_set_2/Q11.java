package semester_1.practical_question.questions_set_2;
/* 
 * Print given using nested for loop
 *  Enter a number : 5
 *      1
 *     2 2
 *    3 3 3
 *   4 4 4 4
 *  5 5 5 5 5
 **/
import java.util.Scanner;

public class Q11 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = obj.nextInt();
    for(int i = 1;i <= n;i++) {
      for(int j = n;j > i;j--) {
        System.out.print(" ");
      }
      for(int j = 1;j <= i;j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    obj.close();
  }
}
