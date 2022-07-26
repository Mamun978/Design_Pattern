package ExamDecorator;

public class ChineseFood extends FoodDecorator{
    public ChineseFood(Food newFood)    {
        super(newFood);
    }
    public String prepareFood(){
        return super.prepareFood() +"Chinese food added ";
    }
    public double foodPrice()   {
        return super.foodPrice()+1000;
    }
}
