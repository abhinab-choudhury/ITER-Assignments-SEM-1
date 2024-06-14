package HomeAssignment;

import java.util.Scanner;

public class A3Q4 {
    public static void main(String[] args) {
        int N; 
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        N = obj.nextInt();

        System.out.print("Is 10 divisible by 5 and 6? ");
        if((N % 5 == 0) && (N % 6 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.print("Is 10 divisible by 5 or 6? ");
        if((N % 5 == 0) || (N % 6 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.print("Is 10 divisible by 5 or 6, but not both? ");
        if(((N % 5 == 0) && (N % 6 != 0) || (N % 5 != 0) && (N % 6 == 0))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        obj.close();
    }
}
