package DecoratorPattern;

public abstract class IceCreamDecorator implements IceCream {

    IceCream iceCream;
    //
   public IceCreamDecorator(IceCream iceCream) {
      this.iceCream = iceCream;
    }
    @Override
    public double getPrice() {
        return iceCream.getPrice();
    }

    @Override
    public String getType() {
        return iceCream.getType();
    }
}
