import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Double> itemsInCart = new HashMap<>();
    private double discount= 0.0;
    public Map<String, Double> getItemsInCart() {
        return itemsInCart;
    }

    public void setItemsInCart(Map<String, Double> itemsInCart) {
        this.itemsInCart = itemsInCart;
    }

    public void addShoppingItems(String name, Double price){
        itemsInCart.put(name, itemsInCart.getOrDefault(name,0.0)+price);

    }

    public void setDiscount(double percentage){
        if(percentage < 1.0 && percentage > 0.0){
            this.discount = percentage;
        }
        else {
            throw new IllegalArgumentException("Discount must be between 0.0 and 1.0");
        }
    }


    public Double calculateCartPrice(){
        double totalPrice =0.0;

        for(Double price: getItemsInCart().values()){
            totalPrice = totalPrice+ price;
        }
        return totalPrice *(1-discount);
    }

 }
