package semester_1.practical_question.questions_set_2;

/*
 * Write a java program to convert all uppercase letter in a string to lowercase without
 * using any libery function.
 */
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

    System.out.println("Enter the String : ");
    String str = obj.nextLine();
    String nstr = "";
    for(int i = 0;i < str.length();i++) { 
      char ch = str.charAt(i);
      
      if(ch >= 'A' && ch <= 'Z') { 
        nstr += (char)(ch + 32);
      } else {
        nstr += ch;
      }
    }
    
    System.out.println("new-string : " + nstr);

    obj.close();
	}
}
