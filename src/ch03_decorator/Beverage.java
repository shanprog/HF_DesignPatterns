package ch03_decorator;

public abstract class Beverage {

    final int SMALL = 0, MEDIUM = 1, LARGE = 2;

    String description = "Unknown Beverage";
    int size = SMALL;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
