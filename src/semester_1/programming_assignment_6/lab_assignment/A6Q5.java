package semester_1.programming_assignment_6.lab_assignment;

import java.util.Scanner;

public class A6Q5 {
  public static double area(int n, double side) {
    return ((n * side * side)/(4 * Math.tan(Math.PI/n)));
  }
  public static void main(String[] args) {
    int n;
    double side;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter of number of sides : ");
    n = obj.nextInt();
    System.out.print("Enter the Lenght of Side : ");
    side = obj.nextDouble();

    System.out.println("Area of Regular Polygon with " + n + " sides : " + area(n, side) + " sq.units");

    obj.close();
  }
}

