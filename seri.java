import java.util.*;

class seri {
  public static void series(int n) {
    int num1= 0;
    int num2 = 1;
    System.out.print("Fibonacci Series: " + num1 + ", " + num2);

    for (int i = 3; i <= n; i++) {
        int nxt = num1 + num2;
        System.out.print(", " + nxt);
        num1 = num2;
        num2 = nxt;

    }
  }public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    series(n);
    sc.close();
  }
}