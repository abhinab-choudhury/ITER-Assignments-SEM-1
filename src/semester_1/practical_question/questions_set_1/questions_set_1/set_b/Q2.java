/*
 * Q2. Write a Java program that includes a method to calculate the average value of each number 
 * in an array with its immediate neighbors, excluding the first and last elements of the array. 
 * The method should return a new array containing these calculated average values.
 */

package semester_1.practical_question.questions_set_1.questions_set_1.set_b;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int N = obj.nextInt();
		int arr[] = new int[N];
		float avg_arr[] = new float[N - 2];
		System.out.println("Enter " + N + " elements : ");
		for(int i= 0;i < N;i++) { 
			arr[i] = obj.nextInt();
		}
		
		for(int i = 1, j = 0;i < N - 1;i++,j++) { 
			avg_arr[j] = (float)(arr[i - 1] + arr[i] + arr[i + 1])/3;
		}
		 
		for(float element : avg_arr) { 
			System.out.print(element + " ");
		}
		System.out.println();
		
		obj.close();
	}
}
