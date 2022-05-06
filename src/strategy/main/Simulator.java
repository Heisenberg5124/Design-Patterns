package strategy.main;

import strategy.client.Cart;
import strategy.client.Duck;
import strategy.client.MallardDuck;
import strategy.client.ModelDuck;
import strategy.strategy.DiscountStrategy;
import strategy.strategy.MuteQuack;
import strategy.strategy.PromotionStrategy;
import strategy.strategy.RegularStrategy;

import java.util.Arrays;
import java.util.List;

public class Simulator {
    public static void main(String[] args) {
        /*Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();*/
        Cart cart = new Cart(new PromotionStrategy());
        List<Double> itemCost = Arrays.asList(10.0, 20.0, 30.0, 40.0);
        System.out.println(cart.calculateCost(itemCost));
    }
}
