import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    // Holds the Items in the cart
    private Map<String, Item> items = new HashMap<>();
    
    // Add an Item to cart
    public void addItem(String itemName, BigDecimal price, int quantity) {
        Item existingItem = items.get(itemName);
        if (existingItem != null) {
            // Item already exists, update quantity
            existingItem.addQuantity(quantity);
        } else {
            items.put(itemName, new Item(itemName, price, quantity));
        }
    }

    // Get total price of the cart
    public BigDecimal getTotal() {
        // Initialize the price with zero
        BigDecimal total = BigDecimal.ZERO;

        // Calculate total
        for(Item item: items.values()) {
            BigDecimal itemTotal = item.getPrice().multiply(BigDecimal.valueOf(item.getQuantity()));
            total = total.add(itemTotal);
        }
        return total;
    }
    // Get Items in the Cart
    public Map<String, Item> getItems() {
        return items;
    }
}
