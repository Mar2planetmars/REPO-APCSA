import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;  
class Main {

  static int totalItems;
  static Item []items;
  static NumberFormat formatter;
  
  public static void main(String[] args) {
   //asking user for data: slayy!!!
    System.out.println("Welcome to my store.");
    totalItems = getNumberOfItems("How many items do you want to buy? ");
    items = new Item[totalItems];
   

    int count = 0;
    while (count < totalItems){
      getItemDetails(count);
      count++;
    }
    
   displayCart();


  }
  //methods that will take data from user
  
  private static void getItemDetails(int index){
    String name =  getItemName("What is the name of item #" + (index + 1) + "? ");
    double price  = getItemPrice("What is the price of item #" + (index+1) + "? ");
    int quantity = getItemQuantity("How many of item #" + (index+1) + " do you want to buy ? ");

    items[index] = new Item(name, price, quantity);
  }

  private static void displayCart(){

    formatter = NumberFormat.getCurrencyInstance(Locale.US);
    System.out.println("################################################");
    System.out.println("shopping cart Details.......");
    System.out.println("################################################");

    for (int i = 0; i < totalItems; i++){
      showLineItem(i);
    }
    System.out.println("##########################################");
    double subtotal = calculateSubtotal();
    double tax = subtotal * .0875;
    double total = subtotal + tax;

    System.out.println("subtotal: " + formatter.format(subtotal));
    System.out.println("sales tax @ 8.75% " + formatter.format(tax));
    System.out.println("Total Cost: " + formatter.format(total));
    System.out.println("Average Cost of All Items: " + formatter.format(subtotal/getTotalItems()));
    System.out.println("Thanks for shopping with us!");
    
  } 

  private static double calculateSubtotal(){
    double total =0;
    for (int i=0; i < totalItems; i++){
    total += items[i].getPrice() * items[i].getQuantity();
    }
    return total;
  }

  private static void showLineItem(int i){
    String quantityText = items[i].getQuantity() + "\t--\t" + items[i].getName() ; //3 -- pencils 
    String priceText = formatter.format(items[i].getPrice()) + " = " + formatter.format(items[i].getPrice() * items[i].getQuantity());

    System.out.format("%-30s %20s%n", quantityText, priceText);
 
  }

  private static int getTotalItems(){
    int sum = 0;
    for (int i=0; i < totalItems; i++)
        sum += items[i].getQuantity();

    return sum;
  }
  
  private static double getItemPrice(String m){
    System.out.print(m);
    Scanner scan = new Scanner(System.in);
    return scan.nextDouble();
  }

  private static String getItemName(String m){
    System.out.print(m);
    Scanner scan = new Scanner(System.in);
    return scan.nextLine(); 
  }

  private static int getItemQuantity(String m){
    System.out.print(m);
    Scanner scan = new Scanner(System.in);
    return scan.nextInt(); 
  }

  private static int getNumberOfItems(String m){
    System.out.print(m);
    Scanner scan = new Scanner(System.in);
    return scan.nextInt(); 
  }

  
}


