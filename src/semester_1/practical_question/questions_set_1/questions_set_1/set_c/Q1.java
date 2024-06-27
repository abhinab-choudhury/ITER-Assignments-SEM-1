/*
 * Q1. Write a complete Java program that implements a method to determine the missing number 
 * in a given array. The array contains integers from 1 to n, inclusive, with exactly one number 
 * missing. There are no duplicates within the array. 
 * public static int findMissingNumber(int[] numbers
 * 
 */

package semester_1.practical_question.questions_set_1.questions_set_1.set_c;

import java.util.Scanner;

public class Q1 {
	public static int findMissingNumber(int[] numbers) {
		int sum = 0, len = numbers.length;
		for(int i = 0;i < len;i++) {
			sum += numbers[i];
		}
		
		int missing_num = ((len + 1) *(len + 2)/2) - sum;
		return missing_num;
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter the size of the Array : ");
		int N = obj.nextInt();
		int arr[] =  new int[N - 1];
		System.out.println("Enter " + (N - 1) + " elements : ");
		for(int i = 0;i < N - 1;i++) { 
			arr[i] = obj.nextInt();
		}
		
		System.out.println("Missing Element is " + findMissingNumber(arr));
		
		obj.close();
	}
}
