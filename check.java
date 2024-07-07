import java.util.*;

class check {
  public static void numberss(int n) {
    int pos = 0;
    int neg = 0;
    int zero = 0;
    for(int i=0;i<n;i++){
    if (i > 0) {
      pos = pos + 1;
    } else if (i < 0) {
      neg = neg + 1;
    } else {
      zero = zero + 1;
    }
  }
  System.out.println("the total positive numbers is:" + pos);
  System.out.println("the total negative numbers is:" + neg);
  System.out.println("the total zero is:" + zero);
}

  public static void main(String args[]) {
    System.out.println("enter the value of n:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    numberss(n);
    sc.close();
  }
}