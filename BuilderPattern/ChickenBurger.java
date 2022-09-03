package BuilderPattern;

public class ChickenBurger implements Item{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 200;
    }
}
