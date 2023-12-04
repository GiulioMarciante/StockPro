import java.util.ArrayList;
import java.util.Iterator;

public class Cart {
    static ArrayList<Device> userCart = new ArrayList<Device>();

 public static void intoCart(int id) {
     Iterator<Device> iterator = Warehouse.deviceList.iterator();
     while (iterator.hasNext()) {
         Device device = iterator.next();
         if (id == device.id) {
             userCart.add(device);
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
            if (id == userCart.id) {
                Warehouse.deviceList.add(userCart);
                iterator.remove();
                break;
            }else{
                System.out.println("Id non corretto");
            }
        }
    }
}