package BuilderPattern;

public class Pepsi implements Item{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 40;
    }
}
