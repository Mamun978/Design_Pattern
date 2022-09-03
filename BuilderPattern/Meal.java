package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    List<Item> items=new ArrayList<>();

    public void addItem(Item item){
        this.items.add(item);
    }

    public double calculateCost(){
        double cost=0;
        for(Item item:items){
            cost+=item.price();
        }
        return cost;
    }
   public void showItem(){
       for(Item item:items){
           System.out.println("Item name: "+item.name());
           System.out.println("Item price: "+item.price());
       }
    }
}
