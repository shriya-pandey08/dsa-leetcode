import java.util.*;

class tab {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int mul = 0;
    try {
      for (int i = 1; i <= 10; i++) {
        mul = num * i;
        System.out.println(num + "*" + i + "=" + mul);
      }
    } finally {
      sc.close();
    }
  }
}