package Strategies;

import Behaviours.IStrategy;

public class Defensive implements IStrategy {
    public String makeMove() {
        return "I am making a defensive move!";
    }
}
