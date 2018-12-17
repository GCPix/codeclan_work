import Players.Player;
import Players.User;

import java.util.ArrayList;

public class GameState {
    private static GameState singleInstance;
    private ArrayList<Player> players = new ArrayList<Player>();

    private GameState(){

    }

    public static GameState getInstance(){
        if(singleInstance==null){singleInstance = new GameState();}
        return singleInstance;
    }
    //static doesn't have a this but normal methods do
    public void addPlayer(Player player){
        this.players.add(player);
    }

    public String startGame() {
        User user = (User) this.players.get(0);
        return user.getName() + " is playing a game against the computer, the computer is playing in ";
    }
}
