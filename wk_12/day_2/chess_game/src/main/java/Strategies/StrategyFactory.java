package Strategies;

import Behaviours.IStrategy;

public class StrategyFactory {
    public IStrategy getStrategy(String stringStrategy) {
        if (stringStrategy.equalsIgnoreCase("Aggressive")) {
            return new Aggressive();
        } else if (stringStrategy.equalsIgnoreCase("Defensive")) {
            return new Defensive();
        }
        return null;
    }
}
