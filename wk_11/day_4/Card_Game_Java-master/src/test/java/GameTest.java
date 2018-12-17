import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Deck deck;
    Player player1;
    Player player2;
    Game game;
   ArrayList<Player> players;


    @Before

    public void before(){
        deck = new Deck();
        deck.populate();
        player1 = new Player("Gillian");
        player2 = new Player("Paul");
        players = new ArrayList<Player>(Arrays.asList(player1, player2));
        game = new Game(players, deck);
    }

    @Test
    public void canCheckHowManyPlayersThereAre(){
        assertEquals(2, game.countPlayers());
    }
//
    @Test
    public void gameCanDeal(){
        game.dealCard(2);
        assertEquals(48, deck.cardCount());
        assertEquals(2, player1.countCards());
        assertEquals(2,player2.countCards() );
    }

    @Test
    public void gameCanCheckScore(){
        game.dealCard(2);
        game.checkScore();
        assertEquals(player2, game.checkScore());
    }



}
