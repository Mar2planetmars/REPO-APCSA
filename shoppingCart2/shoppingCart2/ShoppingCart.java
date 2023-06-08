public class ShoppingCart {
    private Item[] items;
    private int totalItems;
  
    public ShoppingCart(int totalItems){
      this.totalItems = totalItems;
      items = new Item[totalItems];
    }
    
    public boolean addItem(Item newItem, int index){
      items[index] = newItem;
      return true;
    }
  
    
    public Item[] deleteItem(int index){
      totalItems--;
      Item[] newItems = new Item[totalItems];
      int tracker = 0;
      for(int i = 0; i < items.length; i++){
        if(i != index){
          tracker = i;
          newItems[i] = items[tracker];
        }else{
          tracker++;
          newItems[i] = items[tracker];
        }
      }
      return newItems;
    }
  
    public int currentSize(){
      return totalItems;
    }
  
  
    public  double totalPrice(){
      double total = 0;
      
      for(int i = 0; i < items.length ; i++){
        total += items[i].getQuantity()*items[i].getPrice();
      }
      return total;
    }
    
    public  int totalItems(){
      int total = 0;
      for(int i = 0; i < items.length; i++){
        total += items[i].getQuantity();
      }
      return total;
    }
    
    public  double calculateAverage(){
      double average = Math.round((totalPrice()/totalItems())*100.0)/100.0;
      return average;
    }
    public int longestItemName(){
      int longestWordLength = 0;
      for(int i = 0; i < items.length; i++){
        if(items[i].getName().length()>longestWordLength){
          longestWordLength = items[i].getName().length();
        }
      }
      return longestWordLength;
    }
    
    public void displayCart(){
      System.out.println("///////////////////////////////////////////////");
      System.out.println("Shopping Cart Info");
      System.out.println("///////////////////////////////////////////////");
      for(int i = 0; i < items.length; i++){
        System.out.print(items[i].getQuantity());
        if(items[i].getQuantity()/10 >= 1){
          System.out.print("  - ");
        }else{
          System.out.print("  - ");
        }
        System.out.print(items[i].getName());
        System.out.print("-->");
        
          if(items[i].getName().length() == longestItemName()){
            System.out.print(" ");
          }else {
            for(int k = 0; k < (longestItemName()-items[i].getName().length()); k++){
              System.out.print(".");
            }
            System.out.print(" ");
          }
        
        System.out.println("$" + addZeros(items[i].getPrice()) + " = " + "$" + addZeros((Math.round((items[i].getQuantity()*items[i].getPrice())*100.0)/100.0)));
      }
  System.out.println("////////////////////////////////////////////////////");
  
      displayCosts();
  
      
      System.out.println("Thanks for shopping.");
    }
  
    
    public String addZeros(double num){
      String theNum = "" + num;
      String cents = theNum.substring(theNum.length()-2);
      if(cents.indexOf(".") >= 0){
        theNum += "0";
        return theNum;
      }else{
        return theNum;
      }
        
    }
    
   
    public  void displayCosts(){
      
      double totalCost = Math.round(totalPrice()*100.0)/100.0;
      System.out.println("Subtotal: $" + addZeros(totalCost));
      double salesTax = Math.round((totalCost*0.0975)*100.0)/100.0;
      System.out.println("Sales tax @ 9.75%: $" + addZeros(salesTax));
    System.out.println("Total cost: $" + addZeros(Math.round((totalCost+salesTax)*100.0)/100.0));
      System.out.println("Average Cost For All Items: $" + addZeros(calculateAverage()) + "\n");
    }
    
  }
  
  
  
  
  