package semester_1.programming_assignment_5.home_assignment;

import java.util.Scanner;

public class A5Q3 {
  public static void main(String[] args) {
    double error = 1e-6;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the value of X: ");
    double x = obj.nextDouble();

    double sum = 0;
    double k = 1, sign = 1;
    double term = x;
    double fact = 1;
    while(Math.abs(term) > error) {
      sum += term;
      k += 2;
      sign *= -1;
      fact *= k * (k - 1);
      term = sign * Math.pow(x, k)/fact;
    }
    System.out.println("sin (x) = (x) - (x^3)/3! + (x^5)/5! - (x^7)/7! + .... + ");
    System.out.println("sin(" + x +  ") : " + sum);

    obj.close();
  }
}
