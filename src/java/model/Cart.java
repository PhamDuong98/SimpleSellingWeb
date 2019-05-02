
package model;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private HashMap<String, Item> cartItem;
    int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
      
    
    public Cart() {
        cartItem = new HashMap<>();
    }

    public Cart(HashMap<String, Item> cartItems) {
        this.cartItem = cartItems;
    }

    public HashMap<String, Item> getCartItems() {
        return cartItem;
    }

    public void setCartItems(HashMap<String, Item> cartItems) {
        this.cartItem = cartItems;
    }

    public void insertToCart(String key, Item Item) {
        boolean haveKey = cartItem.containsKey(key);
        if (haveKey) {
            Item.setQuantity(Item.getQuantity() + 1);
            cartItem.put(key, Item);
        } else {
            cartItem.put(key, Item);
        }
        setStatus(1);
    }

    //remove one product
    public void subToCart(String key, Item Item) {
        boolean haveKey = cartItem.containsKey(key);
        if (haveKey) {
            int oldQuantity = Item.getQuantity();
            if (oldQuantity <= 1) {
                cartItem.remove(key);
            } else {
                Item.setQuantity(oldQuantity - 1);
                cartItem.put(key, Item);
            }
        }
        setStatus(0);
    }

    public void removeCart(String pid) {
        boolean haveKey = cartItem.containsKey(pid);
        if (haveKey) {
            cartItem.remove(pid);
        }
        setStatus(0);
    }

    public int countProduct() {
        return cartItem.size();

    }

    public double total() {
        double total = 0;
        // total = price * quantity
        for (Map.Entry<String, Item> list : cartItem.entrySet()) {
            total += list.getValue().getProduct().getPrice() * list.getValue().getQuantity();
        }
        return total;
    }

   
    

}
