import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(ArrayList<Player> players, Deck deck){
        this.players = players;
        this.deck = deck;
    }

    public int countPlayers() {
        return this.players.size();
    }




    public void dealCard(int numberOfCards) {
        for(int i = 0; i < countPlayers(); i++){

            this.players.get(i).addCards(deck, numberOfCards);
        }
    }

    public Player checkScore() {
        Player winner = this.players.get(0);
        for(int i = 0; i < countPlayers(); i++){
            if(this.players.get(i).handValue() > winner.handValue()){
                winner = this.players.get(i);
            }
        }
        return winner;
    }

    public String startGame(int numberOfCards){
        for(int i = 0; i < countPlayers(); i++){

            this.dealCard(numberOfCards);
        }
        Player winner = this.checkScore();

        return winner.getname();

    }
}
