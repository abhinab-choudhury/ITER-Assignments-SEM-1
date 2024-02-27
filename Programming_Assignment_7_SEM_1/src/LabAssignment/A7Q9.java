package LabAssignment;
import java.util.Scanner;

public class A7Q9 {
  public static double deviation(double[] x) {
    double deviation, sum = 0.0, mean = mean(x);
    int len = x.length;

    for(int i = 0;i < len;i++) { 
      sum += Math.pow(x[i] - mean, 2);
    }
    deviation = Math.sqrt(sum/(len - 1));

    return deviation;
  }

  public static double mean(double[] x) {
    double mean = 0.0, sum = 0.0;
    int len = x.length;
    
    for(int i = 0;i < len;i++) {
      sum += x[i];
    }
    mean = sum / len;

    return mean;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    double arr[] = new double[10];
    System.out.print("Enter ten numbers: ");
    for(int i = 0;i < 10;i++) { 
      arr[i] = obj.nextDouble();
    }

    System.out.println("The mean is " + (float)mean(arr));
    System.out.println("The standard deviation is " + (float)deviation(arr));

    obj.close();
  }
}
