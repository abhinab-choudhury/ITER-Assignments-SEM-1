package HomeAssignment;

import java.util.Scanner;

public class A3Q1 {
	public static void main(String[] args) {
		int choise, random_num;
		random_num = (int)(3 * Math.random());
		
		Scanner obj = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2) : ");
		choise = obj.nextInt();
		
		if(random_num == 0) {
			System.out.print("The computer is scissor.");
		} else if(random_num == 1) {
			System.out.print("The computer is rock.");
		} else if(random_num == 2) {
			System.out.print("The computer is paper.");
		} else {
			System.out.print("Computer\'s Wrong Input.");
			System.exit(0);
		}
		if(choise == 0) {
			System.out.print(" You are scissor ");
		} else if(choise == 1) {
			System.out.print(" You are rock ");
		} else if(choise == 2) {
			System.out.print(" You are paper ");
		} else {
			System.out.print("Your\'s Wrong Input ");
			System.exit(0);
		}
		
		if(choise == random_num) {
			System.out.print("too. It is a draw");
		} else if(choise == 1 && random_num == 0) {
			System.out.print(". You won.");
		} else if(choise == 1 && random_num == 2) {
			System.out.print(". You Lose.");
		} else if(choise == 0 && random_num == 2) {
			System.out.print(". You won.");
		} else if(choise == 0 && random_num == 1) {
			System.out.print(". You Lose.");
		} else if(choise == 2 && random_num == 1) {
			System.out.print(". You Won.");
		} else if(choise == 2 && random_num == 0) {
			System.out.print(". You Lose.");
		} else {
			System.out.println("Something Went Wrong.");
		}
		
		obj.close();
		
	}
}
