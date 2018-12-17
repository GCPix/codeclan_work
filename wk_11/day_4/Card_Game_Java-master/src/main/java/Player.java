import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
    }
    public String getname(){
        return this.name;
    }


    public int countCards() {
        return this.hand.size();
    }

    public void addCards(Deck deck, int numberOfCards) {
        ArrayList<Card> givenCard = deck.dealCards(numberOfCards);
        for(int i = 0; i < numberOfCards; i++){
            this.hand.add(givenCard.get(i));
        }
    }

    public int handValue() {
        int total = 0;
        for(int i=0; i < countCards(); i++){
            total += this.hand.get(i).getValueFromEnum();
        }
        return total;
    }
}
