public class FibonacciRec {
  // Recursive method to calculate Fibonacci number
  public static int fibonacci(int n) {
    if (n <= 1) {
      return n; // Base cases: fibonacci(0) = 0, fibonacci(1) = 1
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }
  }

  public static void main(String[] args) {
    int number = 10; // Change this value to test with different numbers
    int result = fibonacci(number);
    System.out.println("Fibonacci number at position " + number + " is: " + result);
  }
}
