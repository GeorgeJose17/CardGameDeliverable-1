package cardgamedeliverable.pkg1;


/**
 *
 * @author George Alexander Jose
 */
public class Card {
    private String value;
    private String suit;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    //an array of possible suits 
    public static final String[] SUITS={"Hearts","Diamonds","Spades","Clubs"};
    //an array of possible value
    public static final String[] VALUES={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
}
