package decorator;

public class Simulator {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.display();

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1.display();

        Beverage beverage2 = new Espresso();
        beverage2 = new Topping(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Topping(beverage2);
        beverage2.display();
    }
}
