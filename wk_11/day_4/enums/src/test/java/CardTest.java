import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    private Card card;

    @Before
    public void setUp() throws Exception {
        card = new Card(Suit.HEARTS, Rank.ACE);
    }

    @Test
    public void canGetSuit() {
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void queenHasValue() {
        Card card = new Card(Suit.HEARTS, Rank.QUEEN);
        assertEquals(10, card.getValueFromEnum());

    }

    @Test
    public void test() {
        System.out.println();
        assertEquals(Suit[] suits = Suit.values());
    }
    //


    //    @Test
//    public void suitCanBeMisspelled() {
//        card = new Card("hearts", "Glomp");
//        assertEquals("hearts", card.getSuit());
//    }
}
