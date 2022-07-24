package DecoratorPattern;

public class Chocolate extends  IceCreamDecorator{

    public Chocolate(IceCream iceCream){
        super(iceCream);
    }
    @Override
    public double getPrice() {
        return super.getPrice()+200;
    }

    @Override
    public String getType() {
        return super.getType()+" with Chocolate";
    }
}
