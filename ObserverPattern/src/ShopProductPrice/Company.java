package ShopProductPrice;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String productName;
    private String price;

    public String setPrice(String price) {
        return price;
    }

    public String getProductName() {
        return productName;
    }



    List<Shop> shops=new ArrayList<>();


    public void addShop(Shop shop){

        shops.add(shop);

    }

    public void removeShop(Shop shop){

        shops.remove(shop);

    }

    public void notifyAllShops(){
        for(Shop shop : shops){
            
            shop.priceUpdate();

        }
    }

    public void uploadProduct(String productName){
        this.productName=productName;
        notifyAllShops();
    }

}
