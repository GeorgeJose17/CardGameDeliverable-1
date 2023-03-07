
package cardgamedeliverable.pkg1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author George Alexander Jose
 * The chosen game is "war".
 * The game can be played between two players.
 * It starts by shuffling and then splitting the deck between two players evenly.
 * 
 */
public class CardGameDeliverable1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        Creating a standard deck of 52 cards
        List<Card> deck = new ArrayList<Card>();
        int i = 0;
        
//        Initializing the deck
        for(String suit: Card.SUITS){
            for (String value: Card.VALUES){
                System.out.println("suit "+ suit + " value " + value);
                deck.add( new Card(value, suit));
            }
        }
       
//        shuffling the deck
        Collections.shuffle(deck);
        for(i = 0; i < deck.size(); i++){
            System.out.println("card "+(i+1) + " is " + deck.get(i).getValue() + " of " + deck.get(i).getSuit() );
        }
        
//        Creating two players who will be playing the game
        List<Card> player1 = new ArrayList<Card>();
        List<Card> player2 = new ArrayList<Card>();
        
//        Splitting the cards from the deck to each player
        for(i = 0; i < deck.size(); i++){
//            getting the current value and suit
            String currValue = deck.get(i).getValue();
            String currSuit = deck.get(i).getSuit();
            if(i%2 == 0){
                player1.add(new Card(currValue, currSuit));
            }else{
                player2.add(new Card(currValue, currSuit));
            }
        }
//        Viewing each players hand
        System.out.println("Player 1 Hand");
        for(i = 0; i < player1.size(); i++){
            System.out.println("card "+(i+1) + " is " + player1.get(i).getValue() + " of " + player1.get(i).getSuit() );
        }
        System.out.println("Player 2 Hand");
        for(i = 0; i < player1.size(); i++){
            System.out.println("card "+(i+1) + " is " + player2.get(i).getValue() + " of " + player2.get(i).getSuit() );
        }
        
    }

}
