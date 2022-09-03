package BridgePattern;

public class Circle extends Shape{

    public Circle(Color color){
        super(color);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing the circle using "+this.color.colorTypes());
    }
}
