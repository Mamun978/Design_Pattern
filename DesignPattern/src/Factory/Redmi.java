package Factory;

public class Redmi implements Phone{
    @Override
    public String screen(int s) {
        return "Redmi Screen is : "+s;
    }

    @Override
    public String ram(int r) {
        return "Redmi ram is : "+r;
    }
}
