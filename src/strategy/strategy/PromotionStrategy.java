package strategy.strategy;

import java.util.List;

public class PromotionStrategy implements Strategy {
    private double minCost(List<Double> itemCost) {
        double min = Double.MAX_VALUE;
        for (Double item : itemCost) {
            min = item < min ? item : min;
        }
        return min;
    }

    @Override
    public double calculate(List<Double> itemCost) {
        double result = itemCost.stream().mapToDouble(item -> item).sum();
        result = itemCost.size() >= 3 ? result - minCost(itemCost) : result;
        return result;
    }
}
