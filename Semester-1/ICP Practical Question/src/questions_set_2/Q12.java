package questions_set_2;
/* 
 * Write a program to calculate the area of Circle, Rectangle, Square, Triangle by
 * using methods.
 *
 **/
import java.util.Scanner;

public class Q12 {
  public static float area_triangle(float a, float b,float c) {
    float s = (a + b + c)/3;
    return (float)(Math.sqrt(s*(s - a) * (s - b) * (s - c)));
  }
  public static float area_square(float s) {
    return (s * s);
  }
  public static float area_circle(float r) { 
    return (float)(Math.PI * r * r);
  }
  public static float area_rectangle(float l, float b) { 
    return (l * b);
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("1. Area of Triangle.");
    System.out.println("2. Area of Rectangle.");
    System.out.println("3. Area of Square.");
    System.out.println("4. Area of Circle.");
    int ch = obj.nextInt();

    switch (ch) {
      case 1: {
        System.out.println("Area of Triangle : ");
        System.out.print("side-a : ");
        float a = obj.nextFloat();
        System.out.print("side-b : ");
        float b = obj.nextFloat();
        System.out.print("side-c : ");
        float c = obj.nextFloat();
        System.out.println("Area: " +  area_triangle(a, b, c));
        break;
      }
      case 2:{
        System.out.println("Area of Rectangle: ");
        System.out.print("lenght : ");
        float a = obj.nextFloat();
        System.out.print("width : ");
        float b = obj.nextFloat();
        System.out.println("Area: " +  area_rectangle(a, b));
        break;
      }
      case 3:{
        System.out.println("Area of Square : ");
        System.out.print("Side : ");
        float s = obj.nextFloat();
        System.out.println("Area: " +  area_square(s));
        break;
      }
      case 4:{
        System.out.println("Area of Circle : ");
        System.out.print("radius : ");
        float r = obj.nextFloat();
        System.out.println("Area: " +  area_circle(r));
        break;
      }
      default:
        System.out.println("Wrong Input.");
        break;
    }
    obj.close();
  }
}
