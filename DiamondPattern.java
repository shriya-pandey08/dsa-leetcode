import java.util.Scanner;

public class DiamondPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of rows for the diamond pattern: ");
    int n = sc.nextInt();

    printDiamondPattern(n);

    sc.close();
  }

  public static void printDiamondPattern(int n) {
    // Print the upper part of the diamond
    for (int i = 1; i <= n; i++) {
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // Print the lower part of the diamond
    for (int i = n - 1; i >= 1; i--) {
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
