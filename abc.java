import java.util.*;

public class abc {
  public static void factorialcal(int n) {
    int factorial = 1;
    for (int i = n; i >= 1; i--) {
      factorial = factorial * i;
    }
    System.out.println("the factorial is =" + factorial);
    return;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    factorialcal(n);
    sc.close();
  }
}