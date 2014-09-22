package ch01_ducks;

import java.util.Locale;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
