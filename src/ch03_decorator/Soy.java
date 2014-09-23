package ch03_decorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {

        switch (beverage.getSize()) {
            case 0:
                return 0.1 + beverage.cost();
            case 1:
                return 0.15 + beverage.cost();
            case 2:
                return 0.2 + beverage.cost();
        }

        return 0.1 + beverage.cost();
    }
}
