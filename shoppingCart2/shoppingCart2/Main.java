import java.util.Scanner;
class Main{
  
  public static void main(String[] args){
    int numberOfItems;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("How many items do you wish to buy? ");
    numberOfItems = input.nextInt();
    
    ShoppingCart sc = new ShoppingCart(numberOfItems); 

    
    for(int i = 0; i < numberOfItems; i++){
      input.nextLine();
      System.out.print("What is the name of item #" + (i+1) + "? ");
      
      String name = input.nextLine();
      System.out.print("What is the price of item #" + (i+1) + "? ");
      
      double price = input.nextDouble();
      System.out.print("How many " + name + " do you want to buy? ");
      
      int quantity = input.nextInt();
      sc.addItem(new Item(name, quantity, price), i);
      
    }
    
    sc.displayCart();

  }
}

