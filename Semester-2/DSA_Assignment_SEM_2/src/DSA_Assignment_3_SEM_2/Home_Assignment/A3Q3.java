package DSA_Assignment_3_SEM_2.Home_Assignment;

public class A3Q3 {
  public static void binaryEquivalent(int n) {
    while (n == 0) {
      return;
    }
    binaryEquivalent(n / 2);
    System.out.print(n % 2);
  }

  public static void main(String[] args) {
    int n = 5;
    System.err.print("Binary of " + n + " : "); binaryEquivalent(n);
  }
}
