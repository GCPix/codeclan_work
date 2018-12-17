import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.HEARTS, Rank.KING);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.KING, card.getRank());
    }

    @Test
    public void queenhasValue10(){
        Card card = new Card(Suit.HEARTS, Rank.QUEEN);
        assertEquals(10, card.getValueFromEnum());
    }

    @Test
    public void test(){
    Rank[] ranks = Rank.values();
    System.out.println(ranks[0].getValue());

}


//    @Test
//    public void suitCanBeMispelled(){
//        Card card = new Card("Heeeeearts", "King");
//        assertEquals("Heeeeearts", card.getSuit());
//    }
}
