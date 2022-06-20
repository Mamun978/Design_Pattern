package IntValue;

public class Test {
    public static void main(String[] args) {
        Chain c1=new OneDimension();
        Chain c2=new TwoDimension();
        Chain c3=new ThreeDimension();

        c2.setNext(c1);
        // c1.setNext(c3);

        c2.process(new Dimension(4));
        c2.process(new Dimension(3,5));
        c2.process(new Dimension(4,3,5));
        c2.process(new Dimension(4));






    }
}
