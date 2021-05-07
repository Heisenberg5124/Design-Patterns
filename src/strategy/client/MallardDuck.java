package strategy.client;

import strategy.strategy.FlyNoWay;
import strategy.strategy.FlyWithWings;
import strategy.strategy.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck!");
    }
}
