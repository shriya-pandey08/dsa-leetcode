import java.util.*;

class comp {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    try{
      if (num1==num2) {
      System.out.println("Equal");
    } 
    else if(num1>num2){
      System.out.println("number 1 is greater");
    }
    else {
      System.out.println("number 2 is greater");
    }
  }
  finally{
    sc.close();
  }
  }
}