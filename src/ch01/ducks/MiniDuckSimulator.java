package ch01.ducks;

import java.util.Locale;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
