import java.util.ArrayList;

public class Warehouse {
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


    public static void listaArticoli() {
        if (deviceList.size() > 1) {
            for (Device device : deviceList) {
                System.out.println(device);
            }

        } else {
            System.out.println("Il magazzino è vuoto");
        }
    }

    public static void searchDeviceType(TypesDevice type) {

        for (Device device : deviceList) {
            if (device.getType().equals(type)) {
                System.out.println(device);
            } else if (device.getType().equals(type)) {
                System.out.println(device);
            } else if (device.getType().equals(type)) {
                System.out.println(device);
            }
        }
    }

    public static void searchDeviceBrand(String brand) {
        for (Device device : deviceList) {
            if (device.getBrand().equals(brand)) {
                System.out.println(device);
            } else if (device.getBrand().equals(brand)) {
                System.out.println(device);
            } else if (device.getBrand().equals(brand)) {
                System.out.println(device);
            }
        }
    }

    public static void searchDeviceModel(String model) {
        for (Device device : deviceList) {
            if (device.getModel().equals(model)) {
                System.out.println(device);
            } else if (device.getModel().equals(model)) {
                System.out.println(device);
            } else if (device.getModel().equals(model)) {
                System.out.println(device);
            }
        }

    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
    }
}