import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/shop")
public class ShoppingCartController {

    // Store carts in memory
    private Map<String, Cart> carts = new HashMap<>();

    @PostMapping("/addItem")
    public String addItem(@RequestParam("cartId") String cartId,
                        @RequestParam("itemName") String itemName,
                        @RequestParam("price") BigDecimal price,
                        @RequestParam("quantity") int quantity) {
        
        // Get or Create cart
        Cart cart = carts.get(cartId);
        if (cart == null) {
            cart = new Cart();
            carts.put(cartId, cart);
        }

        // Add item to cart
        cart.addItem(itemName, price, quantity);

        //Get total
        BigDecimal total = cart.getTotal();

        System.out.println("Cart " + cartId + " total: " + total);
        
        return "Item added. Total: " + total;
    }

    @GetMapping("/getTotal")
    public String getTotal(@RequestParam("cartId") String cartId) {
        // Get cart
        Cart cart = carts.get(cartId);

        if (cart == null) {
            return "Cart not found";
        }

        BigDecimal total = cart.getTotal();
        return "Total: " + total;
    }
}