package DecoratorPattern;

public class Nuts extends IceCreamDecorator{
    public Nuts(IceCream iceCream){
        super(iceCream);
    }
    @Override
    public double getPrice() {
        return super.getPrice()+100;
    }

    @Override
    public String getType() {
        return super.getType()+" with Nuts";
    }
}
