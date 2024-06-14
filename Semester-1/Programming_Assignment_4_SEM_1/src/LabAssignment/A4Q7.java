package LabAssignment;

import java.util.Scanner;

public class A4Q7 {
    public static void main(String args[]) {
        int N; 
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter a no. for which you want to find the multiplication table: ");
        N = obj.nextInt();

        System.out.println("The multiplication table of " + N + " is: ");
        
        int t = 1;
        while(t <= 10) { 
            System.out.println(N + " x " + t + " = " + (N * t));
            t++;
        }
        obj.close();
    }
}
