package decorator;

public class Topping extends CondimentBeverage {

    private final Beverage beverage;

    public Topping(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .35 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return String.format("%s, topping", beverage.getDescription());
    }
}
