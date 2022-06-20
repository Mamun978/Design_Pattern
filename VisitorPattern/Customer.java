public class Customer {

public static int calculatePrice(Item[] items){
     ShoppingCartVisitor shoppingCartVisitor=new ShoppingCartVisitorImpl();
    int sum=0;
    for(Item item: items){
        
        sum=sum+item.accept(shoppingCartVisitor);

        
        
    
    }

    return sum;

}

    
    public static void main(String[] args) {
       Item[] items=new Item[]{
           new Computer("HP", 40000, "a3"),
           
           new Mobile("Samsung", 10000, "j4",4)
           
       };

       int totalCost= calculatePrice(items);
       System.out.println("Total Cost: "+totalCost);
    }
}
