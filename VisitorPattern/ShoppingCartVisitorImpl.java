public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{

    @Override
    public int visit(Computer computer) {
        int cost=0;
        if(computer.getPrice()>30000){
             cost=computer.getPrice()-2000;
            System.out.println("Price has reduced  2000 taka"+cost);
        }
        else{
             cost=computer.getPrice();
        }

        return cost;
    }

    @Override
    public int visit(Mobile mobile) {
       int cost=0;
       cost=mobile.getPrice()*mobile.getQuantity();

       System.out.println(mobile.getBrandName()+" brand and model is "+mobile.getBrandModel()+" and total cost: "+cost);
        return cost;
    }
    
}
