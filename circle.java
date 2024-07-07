import java.util.*;

class circle {
  public static void circum(double r) {
    double pi = 3.14;
    double C = 2 * pi * r;
    System.out.println("the circumference of the circle is:" + C);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    circum(r);
    sc.close();
  }
}