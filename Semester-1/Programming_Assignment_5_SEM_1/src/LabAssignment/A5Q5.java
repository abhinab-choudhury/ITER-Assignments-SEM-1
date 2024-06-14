package LabAssignment;

public class A5Q5 {
  public static void main(String[] args) {
    for(int i = 2;i <= 15; i++) {
      System.out.println("Multiplication Table of " + i + " : ");
      
      for(int j = 1;j <= 10;j++) {
        System.out.println(i + " x " + j + " = " + (i * j));
      }
    }
  }
}
