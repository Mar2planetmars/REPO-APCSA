public class Item {
    public class  Item{
        private String name;
        private int quantity;
        private double price;
        
        public Item(String name, int quantity, double price){
          this.name = name;
          this.quantity = quantity;
          this.price = price;
        }
        public void setName(String name){
          this.name = name;
        }
        public void setQuantity(int quantity){
          this.quantity = quantity;
        }
        public void setPrice(double price){
          this.price = price;
        }
        public String getName(){
          return this.name;
        }
        public int getQuantity(){
          return this.quantity;
        }
        public double getPrice(){
          return this.price;
        }
        public String toString(){
          return this.name;
        }
      }
      
      
}
