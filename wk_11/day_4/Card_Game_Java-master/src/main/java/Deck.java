import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;


    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public void populate(){
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();
        for(int i=0; i < 4; i++ ){
            Suit suit = suits[i];

            for(int j=0; j<13; j++){

                Rank rank = ranks[j];

                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public int cardCount() {
        return this.cards.size();
    }

    public int randomise(){
        int randomNumber = new Random().nextInt(this.cards.size());
        return randomNumber;
    }

    public ArrayList<Card> dealCards(int numberOfCards) {

        ArrayList<Card> removedCard = new ArrayList<Card>();
        // add randomiser back in
        for(int i = 0; i < numberOfCards; i++) {
             removedCard.add(this.cards.remove(0));
        }
        return removedCard;
    }
}
