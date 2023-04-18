package Factory;

public class IPhone implements Phone{
    @Override
    public String screen(int s) {
        return "Ihone Screen is : "+s;
    }

    @Override
    public String ram(int r) {
 return "Iphone ram is : "+r;
    }
}
