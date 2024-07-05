import java.util.*;

class circuit {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();

    try{
      switch(button){
      case 1: System.out.println("hello");
      break;
      case 2: System.out.println("namaste");
      break;
      case 3: System.out.println("bonjour");
      break;
      case 4: System.out.println("hola");
      break;
      case 5: System.out.println("vaddakam");
      break;
      case 6: System.out.println("pranam");
      break;
      default: System.out.println("wrong choice!!!");
      break;
      }
  }
   finally{
    sc.close();
  }
  }
}


