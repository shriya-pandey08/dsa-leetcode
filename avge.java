import java.util.*;

class avge {
  public static void cal_avg(int a, int b, int c) {
    float aver = (a + b + c) / 3;
    System.out.println("the average of three numbers is:" + aver);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    cal_avg(a, b, c);
    sc.close();
  }
}