package semester_1.programming_assignment_7.lab_assignment;

import java.util.Scanner;

public class A7Q8 {
  
  static int N;
  static int arr[] = new int[10000];

  public static void createArray(Scanner obj) { 
    System.out.println("Enter the size of the 1-D Array : ");
    N = obj.nextInt();
    System.out.println("Enter " + N + " elements : ");
    for(int i = 0;i < N;i++) { 
      arr[i] = obj.nextInt();
    }

    System.out.println("Array created successfully... :)");
    return;
  }

  public static void displayArray() { 
    for(int i = 0;i < N;i++) { 
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void insertAt(int element, int pos) {
    int temp1 = arr[pos];
    arr[pos] = element;
    for(int i = pos + 1;i < N;i++) {
      int temp2 = arr[i];
      arr[i] = temp1;
      temp1 = temp2;
    }
    arr[N] = temp1;
  }

  public static void deleteAt(int idx) { 
    for(int i = idx + 1;i < N;i++) { 
      arr[i - 1] = arr[i];
    }
    arr[N- 1] = 0;
  }
  public static boolean menu(char ch, Scanner obj) {
    boolean break_flag = false;

    switch (ch) {
      case 'a': { 
        createArray(obj);
        break;
      }
      case 'b': { 
        displayArray();
        break;
      }
      case 'c': {
        System.out.print("Enter the element which you want to insert into the array : ");
        int element = obj.nextInt();
        System.out.print("Enter the index[0 -" + (N - 1) + " ] of the array in which you want to insert " + element + " at : " );
        int pos = obj.nextInt();
        if(pos > (N - 1)  || pos < 0) {
          System.out.println("Bad Input");
          break;
        }
        insertAt(element,pos);
        N++;
        System.out.println("Element inserted successfully.");
        break;
      }
      case 'd': {
        System.out.print("Enter index[0 -" + (N - 1) + " ] the element which you want to delete in the array : ");
        int idx = obj.nextInt();
        if(idx > (N - 1)  || idx < 0) {
          System.out.println("Bad Input");
          break;
        }
        deleteAt(idx);
        N--;
        System.out.println("Element deleted successfully.");
        break;
      }
      case 'e': {
        break_flag = true;
        break;
      }
      default:
        System.out.println("Wrong Input : ");
        break;
    }

    return break_flag;
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int cnt = 0;
    do {
      System.out.println("a. Create an array of N integers");
      System.out.println("b. Display the array elements");
      System.out.println("c. Insert an element at specific position");
      System.out.println("d. Delete an element at a given position");
      System.out.println("e. Exit");
      System.out.println("Enter your choise : ");
      char ch = obj.next().charAt(0);

      if(ch != 'a' && cnt == 0) { 
        System.out.println("Please create a array before performing any operations.");
        continue;
      }
      if(menu(ch, obj)) {
        break;
      }
      cnt++;
    }while(true);
   
    obj.close();
  }
}
