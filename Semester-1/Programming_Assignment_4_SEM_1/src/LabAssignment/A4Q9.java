package LabAssignment;

import java.util.Scanner;

public class A4Q9 {
    public static void main(String args[]) {
        long N, new_N = 0; 
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        N = obj.nextLong();
        
        System.out.print("After removing 0 from number " + N + ",the new number is ");

        int k = 0;
        while(N > 0) {
            if(N % 10 != 0) {
                new_N += Math.pow(10,k) * (N % 10);
                k++;
            }
           N /= 10; 
        }
        System.out.print(new_N);
        
        obj.close();
    }
}


