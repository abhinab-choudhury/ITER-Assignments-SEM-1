package LabAssignment;

import java.util.Scanner;

public class A4Q8 {
    public static void main(String args[]) {
        int computer_guess, user_guess;

        Scanner obj = new Scanner(System.in);

        while(true) {

            computer_guess = (int)(1 + (Math.random() * 10));

            System.out.print("User Guess[1-10] : ");
            user_guess = obj.nextInt();

            System.out.println("Computer Guess : " + computer_guess);
            System.out.println("User Guess : " + user_guess);

            if(user_guess > computer_guess) {
                System.out.println("Too high, try again");
            } else if(user_guess < computer_guess) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Good guess");
                break;
            }
            System.out.println();
        }

        obj.close();
    }
}
