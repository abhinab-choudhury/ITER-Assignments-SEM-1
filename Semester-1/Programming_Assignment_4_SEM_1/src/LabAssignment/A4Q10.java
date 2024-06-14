package LabAssignment;

import java.util.Scanner;

public class A4Q10 {
    public static void main(String args[]) {
        long N, pow;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        N = obj.nextLong();

        pow = 1;
        while(pow <= N) {
            pow *= 3;
        }
        System.out.println("The largest power of 3 less than or equal to " + N + " is " + pow/3);

        obj.close();
    }
}
