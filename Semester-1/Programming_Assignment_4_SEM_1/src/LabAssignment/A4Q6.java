package LabAssignment;

import java.util.Scanner;

public class A4Q6 {
    public static void main(String args[]) { 
        int a, b;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the base : ");
        a = obj.nextInt();
        System.out.print("Enter the power : ");
        b = obj.nextInt();

        int result = a;
        int t = b;
        while((b - 1) > 0) {
            result *= a;
            b--;
        }

        System.out.println(a + " to the power " + t + " is: " + result);

        obj.close();
    }
}
