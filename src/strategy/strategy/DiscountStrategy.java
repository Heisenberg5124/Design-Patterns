package strategy.strategy;

import java.util.List;

public class DiscountStrategy implements Strategy {
    @Override
    public double calculate(List<Double> itemCost) {
        double result = itemCost.stream().mapToDouble(item -> item).sum();
        return result * 0.8;
    }
}
