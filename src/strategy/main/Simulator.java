package strategy.main;

import strategy.client.Duck;
import strategy.client.MallardDuck;
import strategy.client.ModelDuck;
import strategy.strategy.MuteQuack;

public class Simulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();
    }
}
