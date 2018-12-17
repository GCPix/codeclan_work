import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canPopulate(){
        deck.populate();
        assertEquals(52, deck.cardCount());
    }

//    @Test
//    public void canDealOneUnShuffled(){
//        deck.populate();
//
//        Card removedCard = deck.dealCards(1);
//
//        assertEquals(Suit.HEARTS,removedCard.getSuit());
//        assertEquals(Rank.ACE, removedCard.getRank());
//    }
    @Test
    public void canDeal(){
        deck.populate();
        deck.dealCards(3);
        assertEquals(49, deck.cardCount());
    }

//    @Test
//    public void randomNumber(){
//        deck.populate();
//        assertEquals(2, deck.randomise());
//    }

}
