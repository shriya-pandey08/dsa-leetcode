import java.util.*;

class power_cal {
  // Method to calculate power using Math.pow()
  public static double calculatePower(int x, int n) {
    return Math.pow(x, n);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the base number (x): ");
    int x = sc.nextInt();

    System.out.print("Enter the exponent (n): ");
    int n = sc.nextInt();

    double result = calculatePower(x, n);

    System.out.println(x + " raised to the power of " + n + " is: " + result);

    sc.close();
  }
}
