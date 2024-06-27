package semester_1.practical_question.questions_set_2;
/* 
 * 
 * Print given using nested for loop
 *  Enter a number : 4
 *        1
 *      1 2 3
 *    1 2 3 4 5
 *  1 2 3 4 5 6 7
 *
 **/
import java.util.Scanner;

public class Q13 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int n = obj.nextInt();
    for(int i = 1;i <= n;i++) {
      for(int j = n - 1;j >= i;j--) {
        System.out.print("  ");
      }
      for(int j = 1;j <= (i * 2) - 1;j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    
    obj.close();
  }
}
