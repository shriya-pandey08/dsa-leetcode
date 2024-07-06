import java.util.*;

class prod {
  public static int calprod(int a, int b) {
    return a * b;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("the product is ="+calprod(a, b));
  }
}