import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("This program counts your change!");
    System.out.println("Enter your amount of pennies: ");
    double userPennies = input.nextDouble();

    System.out.println("Enter your amount of nickles: ");
    double userNickles = input.nextDouble();

    System.out.println("Enter your amount of dimes: ");
    double userDimes = input.nextDouble();

    System.out.println("Enter your amount of quarters: ");
    double userQuarters = input.nextDouble();

    double pennyAmount = userPennies*0.01;
    double nickleAmount = userNickles*0.5;
    double dimeAmount = userDimes*0.10;
    double quarterAmount = userQuarters*0.25;

    double totalChange = pennyAmount + nickleAmount + dimeAmount + quarterAmount;

    System.out.println("Your total is $" + totalChange);
    
    
   
    
    
  }
}
