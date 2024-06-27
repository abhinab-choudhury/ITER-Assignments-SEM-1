package semester_1.programming_assignment_3.home_assignment;

public class A3Q3 {
    public static void main(String[] args) {
        int random_num = 1 + (int) (12 * Math.random());

        System.out.println("Random Number : " + random_num);
        if(random_num == 1) {
            System.out.print(random_num + " st month of the year is ");
        } else if(random_num == 2) {
            System.out.print(random_num + " nd month of the year is ");
        } else if(random_num == 3) {
            System.out.print(random_num + " rd month of the year is ");
        } else {
            System.out.print(random_num + " th month of the year is ");
        }

        switch (random_num) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                break;
        }
    }
}
