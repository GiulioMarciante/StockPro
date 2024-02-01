import java.util.ArrayList;
import java.util.List;

public class Cart {
    public List<Product> userCart = new ArrayList<>();
    public List<Product> getUserCartList() {
        return userCart;
    }
}