public class Item {
    

   private  String itemName;
   private int price;
   Item(){
       
   }

   Item(String name, int price){
       this.itemName=name;
       this.price=-price;
   }

public String getItemName() {
    return itemName;
}

public void setItemName(String itemName) {
    this.itemName = itemName;
}

public int getPrice() {
    return price;
}

public void setPrice(int price) {
    this.price = price;
}
   


}
