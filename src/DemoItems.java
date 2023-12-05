import java.util.ArrayList;
import java.util.List;

public class DemoItems {
    Device device1 = new Device(TypesDevice.SMARTPHONE, 1, "Samsung", "Galaxy S23", 6.6, 256.0, 550.0, 1099.99);
    Device device2 = new Device(TypesDevice.SMARTPHONE, 2, "Apple", "Iphone 14", 6.1, 128.0, 500.0, 899.99);
    Device device3 = new Device(TypesDevice.SMARTPHONE, 3, "Motorola", "Edge 30 Neo", 6.3, 256.0, 200.0, 299.90);
    Device device4 = new Device(TypesDevice.TABLET, 4, "Samsung", "Galaxy Tab S7 FE", 12.4, 256.0, 230.0, 559.18);
    Device device5 = new Device(TypesDevice.TABLET, 5, "Apple", "iPad Pro", 11.0, 512.0, 950.0, 1449.00);
    Device device6 = new Device(TypesDevice.TABLET, 6, "Lenovo", "Tab M10", 10.1, 64.0, 50.0, 159.00);
    Device device7 = new Device(TypesDevice.NOTEBOOK, 7, "HP", "250 G9", 15.6, 512.0, 400.0, 849.99);
    Device device8 = new Device(TypesDevice.NOTEBOOK, 8, "Apple", "MacBook Air", 15.3, 256.0, 900.0, 1499.99);
    Device device9 = new Device(TypesDevice.NOTEBOOK, 9, "MSI", "Katana 17 B12VGK", 17.3, 1000.0, 1200.0, 2199.99);

    private final List<Device> deviceList;

    public DemoItems() {
        deviceList = new ArrayList<>();
        deviceList.add(device1);
        deviceList.add(device2);
        deviceList.add(device3);
        deviceList.add(device4);
        deviceList.add(device5);
        deviceList.add(device6);
        deviceList.add(device7);
        deviceList.add(device8);
        deviceList.add(device9);
    }
    public List<Device> getDeviceList() {
        return deviceList;
    }

}



