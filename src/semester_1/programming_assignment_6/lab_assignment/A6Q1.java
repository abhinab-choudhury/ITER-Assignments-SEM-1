package semester_1.programming_assignment_6.lab_assignment;

import java.util.Scanner;

public class A6Q1 {
  public static int additionSimple(int x, int y) {
    return (x + y);
  } 

  public static int subtractionSimple(int x, int y) {
    return (x - y);
  } 

  public static int multiplicationSimple(int x, int y) {
    return (x * y);
  } 

  public static double divisionSimple(int x, int y) {
    double div = 0.0;
    if(y == 0) {
      System.out.println("Please check whether \'x\' is zero before dividing.");
      return div;
    } else {
      div = x/(double)y;
    }
    return div;
  } 

  public static int remainderSimple(int n, int m) {
    return (n % m);
  } 

  public static double squareRootSimple(int n) {
    return (Math.sqrt(n));
  } 
  public static void main(String[] args) {
    int A, B, ch;
    Scanner obj = new Scanner(System.in);

    System.out.println("1. Simple Addition");
    System.out.println("2. Simple Subraction");
    System.out.println("3. Simple Division");
    System.out.println("4. Simple Remainer");
    System.out.println("5. Simple Square-Root");
    System.out.print("Enter Your Choise: ");
    ch = obj.nextInt(); 

    switch (ch) {
      case 1:
        System.out.println("Enter Two Number : ");
        System.out.print("A : ");
        A = obj.nextInt(); 
        System.out.print("B : ");
        B = obj.nextInt(); 
        System.out.println("Addition of " + A + " and " + B + " is  : A + B = " + additionSimple(A, B));
        break;

      case 2:
        System.out.println("Enter Two Number : ");
        System.out.print("A : ");
        A = obj.nextInt(); 
        System.out.print("B : ");
        B = obj.nextInt(); 
        System.out.println("Subtraction of " + A + " and " + B + " is  : B - A = " + subtractionSimple(B, A));
        break;

      case 3:
        System.out.println("A divided by B : ");
        System.out.print("A : ");
        A = obj.nextInt(); 
        System.out.print("B : ");
        B = obj.nextInt(); 
        System.out.println("Division of " + A + " and " + B + " is  : B / A = " + divisionSimple(B, A));
        break;

      case 4:
        System.out.println("Enter Two Number : ");
        System.out.print("A : ");
        A = obj.nextInt(); 
        System.out.print("B : ");
        B = obj.nextInt(); 
        System.out.println("Remainder of " + A + "/" + B + " is  : A % B = " + remainderSimple(A, B));
        break;

      case 5:
        System.out.println("sqrt(N)");
        System.out.print("N : ");
        A = obj.nextInt(); 
        System.out.println("Square Root of " + A + " is  : Math.Sqrt(N) = " +  squareRootSimple(A));
        break;

      default:
        System.out.println("Wrong Choise.");
        break;
    }

    obj.close();
  }
}
