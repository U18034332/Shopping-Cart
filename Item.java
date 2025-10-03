import java.math.BigDecimal;

public class Item {
    private final String itemName;
    private  final BigDecimal price;
    private int quantity;

    public Item(String itemName, BigDecimal price, int quantity) {
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