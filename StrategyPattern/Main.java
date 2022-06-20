
public class Main {
    
    public static void main(String []args){
           
        ShopingCart cart=new ShopingCart();

        // Item item1=new Item();
        // item1.setItemName("Apple");
        // item1.setPrice(100);
        Item item1=new Item("Apple", 100);
        Item item2=new Item("Fish", 200);
        Item item3=new Item("Vegetable", 200);

        cart.additem(item1);
        cart.additem(item2);
        cart.additem(item3);
        cart.removeItem(item2);
        
        cart.pay(new CreditCardStrategy());
        cart.pay(new BkashStrategy());
        

    

    }
}
