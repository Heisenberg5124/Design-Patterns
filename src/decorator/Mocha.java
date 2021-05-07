package decorator;

public class Mocha extends CondimentBeverage {

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return String.format("%s, Mocha", beverage.getDescription());
    }
}
