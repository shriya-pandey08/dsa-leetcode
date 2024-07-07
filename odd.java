import java.util.*;

class odd {
  public static void sum_odd(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        sum = sum + i;
      }
    }
    System.out.println("the sum of n numbers is:" + sum);
  }

  public static void main(String args[]) {
    System.out.println("Enter the value of n");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sum_odd(n);
    sc.close();
  }
}