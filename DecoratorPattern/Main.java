package DecoratorPattern;

public class Main {

    public static void main(String[] args) {
        IceCream iceCream=new Vanilla();
        iceCream=new Chocolate(new Nuts(iceCream));
        System.out.println(iceCream.getPrice()+"--"+iceCream.getType());
    }
}
