import java.util.ArrayList;
import java.util.List;

public class ShopingCart {

    // private PaymentStrategy paymentStrategy;
    
    List<Item> items=new ArrayList<>();


    public void additem(Item i){
        items.add(i);
    }

    public void removeItem(Item i){
        items.remove(i);
    }
     public int calculatePrice(){
        int totalPrice=0;

        for(Item item: items){
             totalPrice=totalPrice+item.getPrice();
        }

        return totalPrice;

     }

    //  ShopingCart(PaymentStrategy p){
    //      this.paymentStrategy=p;
    //  }

     public void pay(PaymentStrategy paymentMethod){
         int amount=calculatePrice();
         paymentMethod.pay(amount);
     }

    
}
