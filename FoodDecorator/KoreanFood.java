package ExamDecorator;

public class KoreanFood implements Food{
    @Override
    public String prepareFood() {
        return "korean food ,";
    }

    @Override
    public double foodPrice() {
        return 2000;
    }
}
