import java.util.*;

class great {
  public static void greatest(int a, int b) {
    if (a > b) {
      System.out.println("the greater number is a which is:" + a);
    } else {
      System.out.println("the greater number is b which is:" + b);
    }

  }

  public static void main(String args[]) {
    System.out.println("Enter the value of a and b:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    greatest(a, b);
    sc.close();
  }
}