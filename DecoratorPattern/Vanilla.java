package DecoratorPattern;

public class Vanilla implements IceCream {
    @Override
    public double getPrice() {
        return 100;
    }

    @Override
    public String getType() {
        return "Vanilla";
    }
}
