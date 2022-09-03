package BridgePattern;

public class Rectangle extends Shape{

    Rectangle(Color c){
        super(c);
    }
    @Override
    public void drawShape() {
        System.out.println("Drawing rectangle using color "+ this.color.colorTypes());
    }
}
