import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;

public class CartManager {
    static List<Product> productToCart = Warehouse.productList;
    static Cart cart = new Cart();
    static List<Product> finalCartList = cart.getUserCartList();

    public List<Product> intoCart(int id) {

        Iterator<Product> iterator = productToCart.listIterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (id == product.getId()) {
                finalCartList.add(product);
                iterator.remove();
                break;
            }

        }
        return finalCartList;
    }

    public List<Product> outOfCart(int id) {

        Iterator<Product> iterator = finalCartList.iterator();
        while (iterator.hasNext()) {
            Product userCart = iterator.next();
            if (id == userCart.getId()) {
                productToCart.add(userCart);
                iterator.remove();
                break;
            }
        }
        return finalCartList;
    }

    public BigDecimal totalCart() {
        double total = 0.0;
        for (Product product : finalCartList) {
            total += product.getSalesPrice();
        }
        return BigDecimal.valueOf(total).setScale(2, RoundingMode.HALF_EVEN);
    }

    public List<Product> completePurchase() {
        finalCartList.clear();
        return finalCartList;
    }
}
