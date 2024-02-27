package HomeAssignment;

import java.util.Scanner;

public class A5Q3 {
  public static void main(String[] args) {
    double error = 1e-6;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the value of X: ");
    double x = obj.nextDouble();

    double sum = 0;
    double k = 2, sign = 1;
    double term = 1;
    double fact = 1;
    while(Math.abs(term) > error) {
        sum += term;
        sign *= -1;
        fact *= k * (k - 1);
        term = sign * Math.pow(x, k)/fact;
        k += 2;
    }
    System.out.println("cos(x) = 1 - (x^2)/2! + (x^4)/4! - (x^6)/6! + .... " );
    System.out.println("cos(" + x + ") : " + sum);

    obj.close();
  }
}
