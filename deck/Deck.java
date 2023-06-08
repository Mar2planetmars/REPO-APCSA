import java.util.ArrayList;
import java.util.Random;


public class Deck {
    
private ArrayList<Card> cards = new ArrayList <Card> ();

    public Deck() {
        String[]names = {"Ace", "Two", "Three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "King"};
        String[]suits = {"clubs", "diamonds", "hearts", "spades"};
        int[]values = {1,2,3,4,5,6,7,8,9,10,10,10,10};
        
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cards.add(new Card(names[i],suits[j], values[i]));
            }
        }
    
    
    }  

    public void displayCards() {
         for (Card i: cards){
            System.out.print(i);
         }
    }



//suffle method 

public void shuffle() {
   Random random = new Random();
    for (int i = 0; i < cards.size() - 1; i++) {
        int j = random.nextInt(cards.size());
        Card temp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, temp);
    }
}


}
