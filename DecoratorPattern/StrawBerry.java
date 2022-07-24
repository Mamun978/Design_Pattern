package DecoratorPattern;

public class StrawBerry implements IceCream{
    @Override
    public double getPrice() {
        return 150;
    }

    @Override
    public String getType() {
        return "StrawBerry";
    }
}
