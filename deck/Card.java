public class Card {

    private String name;
    private int value;
    private String suit;
    
        public Card(String name, String suit, int value) {
            this.name = name;
            this.value = value; 
            this.suit = suit;
        }
    
    
        public String getName() {
            return this.name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getValue() {
            return this.value;
        }
    
        public void setValue(int value) {
            this.value = value;
        }
    
        public String getSuit() {
            return this.suit;
        }
    
        public void setSuit(String suit) {
            this.suit = suit;
        }
    
        public String toString() {
            return "{" +
                " name='" + this.getName() + " of " +
                ", value='" + this.getSuit() + "'" + "}";
        }
       
    
    }