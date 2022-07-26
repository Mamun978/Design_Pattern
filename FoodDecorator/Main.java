package ExamDecorator;

public class Main {

    public static void main(String[] args) {

        Food food=new BangladeshiFood();
        food=new ChineseFood(new IndianFood(food));

        System.out.println("Food Name: "+food.prepareFood()+ "---- "+ "Total Food Price: "+food.foodPrice());

        System.out.println("-----------");

        Food food2=new KoreanFood();
        food2=new IndianFood((food2));
        System.out.println("Food Name: "+food2.prepareFood()+ "---- "+ "Total Food Price: "+food2.foodPrice());


    }

}
