package ch05_singleton;

public class ChocolateBoiler {

    private static volatile ChocolateBoiler boiler;

    private boolean empty;
    private boolean boiled;


    public static ChocolateBoiler getInstance() {

        if (boiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (boiler == null) {
                    boiler = new ChocolateBoiler();
                }
            }
        }

        return boiler;
    }

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
