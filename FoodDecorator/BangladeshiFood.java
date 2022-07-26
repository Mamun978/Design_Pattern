package ExamDecorator;

public class BangladeshiFood implements  Food{
    @Override
    public String prepareFood() {
        return "Bangladeshi Food, ";
    }

    @Override
    public double foodPrice() {
        return 500;
    }
}
