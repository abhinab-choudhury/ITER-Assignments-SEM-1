package semester_1.programming_assignment_3.lab_assignment;

import java.util.Scanner;

public class A3Q7 {
	public static void main(String[] args) {
		
		int N;
		float total_price, amt_payable, dis, dis_amount;
		total_price = 0.0f;
		amt_payable = 0.0f;
		dis = 0.03f;
		dis_amount = 0.0f;
		
		Scanner obj = new Scanner(System.in);
	
		System.out.println("========== Monthly Electricity Bill Calculator ==========");
		System.out.print("Enter the number of Units : ");
		N = obj.nextInt();
		
		if(N >=0 && N <= 50) {
			total_price = 3.0f * N; 
		}else if(N > 50 && N <= 200) {
			total_price = (3.0f * 50) + ((N - 50) * 4.8f);
		}else if(N > 200 && N <= 400) {
			total_price = (3.0f * 50) + (150 * 4.8f) + ((N - 200) * 5.8f);
		}else if(N >= 400) {
			total_price = (3.0f * 50) + (150 * 4.8f) + (200 * 5.8f) + ((N - 400) * 6.2f);
		} else {
			System.out.println("Something went Wrong.");
		}
		
		System.out.print("Do you want to pay online(y/n): ");
		char choise = obj.next().charAt(0);
		
		if(choise == 'n' || choise == 'N') {
		
			amt_payable = total_price;
			System.out.println("Amount payable: " + amt_payable);
		
		} else if(choise == 'y' || choise == 'Y') {
			
			dis_amount = dis * total_price;
			amt_payable = total_price - dis_amount;
			System.out.println("Total amount: " + total_price + " Rs");
			System.out.println("Discount : " + dis_amount + " Rs");
			System.out.println("Amount payable: " + amt_payable + " Rs");
		
		} else {
			System.out.println("Press Y/y for Yes or N/n for No");
		}
		
		obj.close();
	} 
}
