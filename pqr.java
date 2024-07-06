import java.util.*;

public class pqr {
  public static void fact_cal(int n) {
    int factorial = 1;
    if (n < 0) {
      System.out.println("invalid");
      return;
    } else {
      for (int i = n; i >= 1; i--) {
        factorial = factorial * i;
      }
      System.out.println("the factorial is =" + factorial);
      return;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    fact_cal(n);
  }
}