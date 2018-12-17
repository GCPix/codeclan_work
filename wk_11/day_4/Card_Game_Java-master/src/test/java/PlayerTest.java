import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;

    @Before
    public void before(){
        player = new Player("Gillian");
        deck = new Deck();
        deck.populate();

    }

    @Test
    public void playerHandStartsEmpty(){
        assertEquals(0, player.countCards());
    }

    @Test
    public void playerCanAddCard(){
        player.addCards(deck, 1);
        assertEquals(1, player.countCards());
        assertEquals(51, deck.cardCount());
    }

    @Test
    public void playerCanWorkOutValueOfCards(){
        player.addCards(deck, 1);
        assertEquals(1, player.handValue());
    }
}
