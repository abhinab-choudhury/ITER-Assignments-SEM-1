package semester_1.programming_assignment_6.lab_assignment;

import java.util.Scanner;public class A6Q10 {
  
  public double area(double r) {
    // Area of Circle
    return (Math.PI * r * r);
  }
  
  public double area(double a, double b, double c) {
    // Area of Triangle
    double semi_p = (a + b + c)/2;
    return (Math.sqrt(semi_p * (semi_p - a) * (semi_p - b) * (semi_p - c)));
  }
  
  public int area(int side) {
    return (side * side);
  }
  
  public double area(double l, double b) {
    return (l * b);
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    A6Q10 obb = new A6Q10();

    System.out.println("1. Calculate Area of Circle.");
    System.out.println("2. Calculate Area of Triangle.");
    System.out.println("3. Calculate Area of Square.");
    System.out.println("4. Calculate Area of Rectangle.");
    System.out.print("Enter you Choise : ");
    int ch = obj.nextInt();

    switch (ch) {
      case 1:
        System.out.print("Enter the Radius of Circle : ");
        double r = obj.nextDouble();
        System.out.println("Area of the Circle : " + obb.area(r));
        break;

      case 2:
        System.out.print("Enter the 3 sides : ");
        double a = obj.nextDouble();
        double b = obj.nextDouble();
        double c = obj.nextDouble();
        System.out.println("Area of the Circle : " + obb.area(a,b,c));
        break;

      case 3:
        System.out.print("Enter the length of side : ");
        int s = obj.nextInt();
        System.out.println("Area of the Circle : " + obb.area(s));
        break;

      case 4:
        System.out.print("Enter the length and width of Reactangle : ");
        double l = obj.nextDouble();
        double w = obj.nextDouble();
        System.out.println("Area of the Circle : " + obb.area(l,w));
        break;

      default:
        System.out.println("Enter the correspoding number to select.");
        break;
    }

    obj.close();
  }
}
