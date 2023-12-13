import java.util.Iterator;
import java.util.List;

public class CartManager {
    static List<Device> deviceToCart = Warehouse.deviceList;
    static Cart cart = new Cart();

    public static void intoCart(int id) {

        Iterator<Device> iterator = deviceToCart.listIterator();
        while (iterator.hasNext()) {
            Device device = iterator.next();
            if (id == device.getId()) {
                cart.userCart.add(device);
                iterator.remove();
                break;
            }else{
                System.out.println("Id non corretto");}
        }
    }
    public static void outOfCart(int id){

        Iterator<Device> iterator = cart.userCart.iterator();
        while (iterator.hasNext()) {
            Device userCart = iterator.next();
            if (id == userCart.getId()) {
                deviceToCart.add(userCart);
                iterator.remove();
                break;
            }else{
                System.out.println("Id non corretto");
            }
        }
    }
}
