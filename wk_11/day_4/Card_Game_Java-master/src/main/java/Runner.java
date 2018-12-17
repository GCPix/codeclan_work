import java.util.ArrayList;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Game game;
        Player player1;
        Player player2;
        ArrayList<Player> players;
        Deck deck;

        player1 = new Player("Gillian");
        player2 = new Player("Paul");
        players = new ArrayList<Player>(Arrays.asList(player1, player2));
        deck = new Deck();
        deck.populate();

        game = new Game(players, deck);
//        game.startGame(2);

        System.out.println(game.startGame(2));
    }
}
