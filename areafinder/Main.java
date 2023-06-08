import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   
    
    Scanner input = new Scanner(System.in);

    System.out.println("This program calculates the area of a Trapezoid"); 
    
    System.out.println("What is the length of the long base?");
    double a = input.nextDouble();

    System.out.println("What is the length of the short base?");
    double b = input.nextDouble();

    System.out.println("What is the height of the trapezoid?");
    double h = input.nextDouble();

    double result = 0.5*(a+b)*h;
    
    System.out.println("The area of a Trapezoid is " + result + ".");

    
  }
}
