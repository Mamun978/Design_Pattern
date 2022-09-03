package BuilderPattern;

public class VegBurger implements  Item{
    @Override
    public String name() {

        return "VegBurger";
    }

    @Override
    public double price() {
        return 150;
    }
}
