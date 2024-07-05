import java.util.*;

class checks {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    try{
      if (num % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
  finally{
    sc.close();
  }
  }
}