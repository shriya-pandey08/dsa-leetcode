import java.util.Scanner;

class Check {
  public static void countNumbers() {
        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0, zero = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            } else {
                zero++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);
        }while(choice=='y'||choice=='Y');

  System.out.println("The total positive numbers: "+pos);System.out.println("The total negative numbers: "+neg);System.out.println("The total zeros: "+zero);

  sc.close();

  }

  public static void main(String[] args) {
        countNumbers();
    }
}
