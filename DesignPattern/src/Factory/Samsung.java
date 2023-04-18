package Factory;

public class Samsung implements Phone{
    @Override
    public String screen(int s) {
        return "Samsung phone Screen is : "+s;
    }

    @Override
    public String ram(int r) {
        return "Samsung ram is : "+r;
    }
}
