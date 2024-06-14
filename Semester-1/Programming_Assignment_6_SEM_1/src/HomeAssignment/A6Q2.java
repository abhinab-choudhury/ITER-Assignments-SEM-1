package HomeAssignment;

import java.util.Scanner;

public class A6Q2 {
  public static int volume(int side) {
    // Volume of Cube.
    return (side * side * side);
  }
  
  public static double volume(double l, double b, double h) {
    // Volume of Cuboid.
    return (l * b * h);
  }
  
  public static double volume(double r) {
    // Volume of sphere.
    return (4.0/3 * Math.PI * r * r * r);
  }
  
  public static void main(String[] args) {
    
    Scanner obj = new Scanner(System.in);
    
    System.out.println("1. Volume of Sphere");
    System.out.println("2. Volume of Cude");
    System.out.println("3. Volume of Cuboid");
    System.out.print("Enter your Chosie : ");
    int ch = obj.nextInt();

    switch (ch) {
      case 1:
        System.out.print("Enter the radius of the Sphere : ");
        double r = obj.nextDouble();
        System.out.println("Volume of the Cube is : " + volume(r));
        break;

      case 2:
        System.out.print("Enter the length of the Sides : ");
        int sides = obj.nextInt();
        System.out.println("Volume of the Cube is : " + volume(sides));
        break;

      case 3:
        System.out.print("Enter the dimensions of the Cuboid : ");
        double l = obj.nextDouble();
        double b = obj.nextDouble();
        double h = obj.nextDouble();
        System.out.println("Volume of the Cuboid is : " + volume(l, b, h));
        break;

      default:
        System.out.println("Please enter the corresponding number to select.");
        break;
    }
  }
}
