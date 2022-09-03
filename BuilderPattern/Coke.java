package BuilderPattern;

public class Coke implements Item{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 50;
    }
}
