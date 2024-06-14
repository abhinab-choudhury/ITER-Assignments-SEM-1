package DSA_Assignment_3_SEM_2.Home_Assignment;

public class A3Q1 {
  public static int GCD(int a, int b) {
    if (b == 0) {
      return a;
    }

    return GCD(b, a % b);
  }

  public static void main(String[] args) {
    int n = 20, m = 5;
    System.out.println("GCD(" + n + "," + m + ") : " + GCD(n, m));
  }
}
