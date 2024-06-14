package HomeAssignment;

import java.util.Scanner;

public class A3Q5 {
    public static void main(String[] args) {
        String first_name, last_name;
        char gender, choise;
        int age;

        Scanner obj = new Scanner(System.in);
        System.out.print("What is your gender (M or F): ");
        gender = obj.next().charAt(0);
        System.out.print("First name: ");
        first_name = obj.next();
        System.out.print("Last name : ");
        last_name = obj.next();
        System.out.print("Age: ");
        age = obj.nextInt();

        if(gender == 'M' || gender == 'm') {
            if(age >= 20) {
                System.out.println("Then I shall call you Mr. " + first_name + " " + last_name + ".");
            } else {
                System.out.println("Then I shall call you " + first_name + " " + last_name + ".");
            }
        } else if(gender == 'F' || gender == 'f' ) {
            if(age >= 20) {
                
                System.out.print("Are you married," +  first_name + "(y or n)? ");
                choise = obj.next().charAt(0);
                
                if(choise == 'y' || choise == 'Y') {
                    System.out.println("Then I shall call you Mrs. " + first_name + " " + last_name + ".");
                } else if(choise == 'n' || choise == 'N') {
                    System.out.println("Then I shall call you Ms. " + first_name + " " + last_name + ".");
                }
            } else {
                System.out.println("Then I shall call you " + first_name + " " + last_name + ".");
            }
        } else {
            System.out.println("Please Enter your gender in correct format.");
        }

        obj.close();
    }
}
