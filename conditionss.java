import java.util.*;

class conditionss {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    try{if (age >= 18) {
      System.out.println("Adult");
    } else {
      System.out.println("Not Adult");
    }
  }
  finally{
    sc.close();
  }
  }
}