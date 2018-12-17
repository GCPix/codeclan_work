import Behaviours.IStrategy;
import Players.CPU;
import Players.Player;
import Players.User;
import Strategies.StrategyFactory;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Please enter player1 name");

        Scanner scanner = new Scanner(System.in);
        String name  = scanner.nextLine();
        User player1 = new User(name);
        GameState state = GameState.getInstance();
        state.addPlayer(player1);

        System.out.println("What type of CPU would like to play against?");

        String strategy = scanner.nextLine();
        StrategyFactory factory = new StrategyFactory();
        IStrategy strategyRequested = factory.getStrategy(strategy);
        Player cpu = new CPU(strategyRequested);
        state.addPlayer(cpu);
        System.out.println(state.startGame());
    }
}
