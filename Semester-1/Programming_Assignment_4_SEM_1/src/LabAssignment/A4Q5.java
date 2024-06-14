package LabAssignment;

import java.util.Scanner;

public class A4Q5 {
    public static void main(String args[]) {
        int N, sum = 0;
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        N = obj.nextInt();

        for(int i = 1;i * i <= N;i++) {
            if(N % i == 0) {
                if(i != N/i && i != 1) { 
                    sum += i + N/i;
                } else {
                    sum += i;
                }
            }
        }
        
        if(N == sum) {
            System.out.println(N + " is a perfect number.");
        } else {
            System.out.println(N + " is not a perfect number.");
        }
        obj.close();
    }
}
