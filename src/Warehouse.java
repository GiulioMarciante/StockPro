import java.util.ArrayList;

public class Warehouse{
    DemoItems demoItems = new DemoItems();

    static ArrayList<Device> deviceList = new ArrayList<>();

    public Warehouse() {
        deviceList.add(demoItems.device1);
        deviceList.add(demoItems.device2);
        deviceList.add(demoItems.device3);
        deviceList.add(demoItems.device4);
        deviceList.add(demoItems.device5);
        deviceList.add(demoItems.device6);
        deviceList.add(demoItems.device7);
        deviceList.add(demoItems.device8);
        deviceList.add(demoItems.device9);
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        for (Device device : deviceList){
            System.out.println(device);
        }
    }

}
