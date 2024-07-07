import java.util.*;

class age {
  public static void eligible(int n) {
    if (n >= 18) {
      System.out.println("the person is eligible to vote");
    } else {
      System.out.println("the person is not eligible to vote");
    }

  }

  public static void main(String args[]) {
    System.out.println("Enter the value of n");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    eligible(n);
    sc.close();
  }
}