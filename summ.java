import java.util.*;
class summ{
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    int sum=0;
    try{    
      for ( int i = 1; i<=n; i++)
      {
        sum=sum+i;
      } 
      System.out.println(sum);
    }
    finally
    {
      sc.close();
    }
  }
}