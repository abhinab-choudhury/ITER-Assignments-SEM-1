package DSA_Assignment_3_SEM_2.Lab_Assignment;

import java.util.Scanner;

class MarksOutOfBoundException extends Exception {
  public MarksOutOfBoundException(String err) {
    super(err);
  }
}

class Student {
  int marks;
  public void setMarks() {
    Scanner obj = new Scanner(System.in);

    try {
      System.out.print("Enter Mark for Subject 1: ");
      marks = obj.nextInt();
  
      if(marks > 100) {
        throw new MarksOutOfBoundException("Marks Should not be greater more than 100.");
      } else {
        System.out.println("Marks Obtained : " + this.marks);
      }
    } catch(Exception e) {
      System.out.println(e);
    } finally {
      obj.close();
    }
  }
}

public class A3Q3 {
  public static void main(String[] args) {
    Student student = new Student();
    student.setMarks();
  }
}
