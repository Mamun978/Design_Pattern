package ExamDecorator;

public class IndianFood extends FoodDecorator{

    public IndianFood(Food newFood)    {
        super(newFood);
    }
    public String prepareFood(){
        return super.prepareFood() +"Indian food Added, ";
    }
    public double foodPrice()   {
        return super.foodPrice()+2000;
    }

}
