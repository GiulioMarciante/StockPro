import java.util.Iterator;
import java.util.List;

public class ManageCart {
    static List<Device> deviceToCart = Warehouse.deviceList;

    public static void intoCart(int id) {
        Iterator<Device> iterator = deviceToCart.listIterator();
        while (iterator.hasNext()) {
            Device device = iterator.next();
            if (id == device.getId()) {
                Cart.userCart.add(device);
                iterator.remove();
                break;
            }else{
                System.out.println("Id non corretto");}
        }
    }
    public static void outOfCart(int id){
        Iterator<Device> iterator = Cart.userCart.iterator();
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
