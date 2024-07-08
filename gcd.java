import java.util.*;

class gcd {
  public static void cal(int num1, int num2) {
    while (num1 != num2) {
      if (num1 > num2) {
        num1 = num1 - num2;
      } else {
        num2 = num2 - num1;
      }
    }
    System.out.println("the gcd is:" + num2);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    cal(num1, num2);
    sc.close();
  }
}