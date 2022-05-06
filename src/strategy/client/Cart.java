package strategy.client;

import strategy.strategy.Strategy;

import java.util.List;

public class Cart {
    private Strategy strategy;

    public Cart(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calculateCost(List<Double> itemCost) {
        return this.strategy.calculate(itemCost);
    }
}
