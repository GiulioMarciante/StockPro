import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> userCart = new ArrayList<>();
    public List<Product> getUserCartList() {
        return userCart;
    }
}