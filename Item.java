import java.math.BigDecimal;

public class Item {
    private String cartId;
    private String itemName;
    private BigDecimal price;
    private int quantity;

    public Item(String cartId, String itemName, BigDecimal price, int quantity) {
        this.cartId = cartId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int q) {
        quantity += q;
    }

}