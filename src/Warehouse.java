import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Warehouse {
    static DemoItems demoItems = new DemoItems();
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
        if (!deviceList.isEmpty()) {
            for (Device device : deviceList) {
                System.out.println(device);
            }

        } else {
            System.out.println("Il magazzino è vuoto");
        }
    }

    public static void searchDeviceType(TypesDevice type) {
        boolean dispositivoTrovato = false;

        for (Device device : deviceList) {
            switch (type) {
                case TABLET:
                case NOTEBOOK:
                case SMARTPHONE:
                    if (device.getType().equals(type)) {
                        System.out.println(device);
                        dispositivoTrovato = true;
                    }
                    break;
                default:
                    break;
            }
        }
        if (!dispositivoTrovato) {
            System.out.println("Non ci sono prodotti con queste caratteristiche al momento in magazzino");
        }
    }

    public static void searchDeviceBrand(String brand) {
        boolean dispositivoTrovato = false;
        for (Device device : deviceList) {
            switch (brand) {
                case "Apple":
                case "Samsung":
                case "Lenovo":
                case "Motorola":
                case "HP":
                case "MSI":
                    if (device.getBrand().equals(brand)) {
                        System.out.println(device);
                        dispositivoTrovato = true;
                    }
                    break;
                default:
                    break;
            }
        }
        if (!dispositivoTrovato) {
            System.out.println("Non ci sono prodotti con queste caratteristiche al momento in magazzino");
        }
    }
    public static List<Device> searchDeviceModel(String model){
        List<Device> searchModelResult = new ArrayList<>();
        for(Device device : deviceList){
            if(device.getModel().equals(model)){
                searchModelResult.add(device);
            }
        }
        if(searchModelResult.isEmpty()){
            System.out.println("Non ci sono prodotti con queste caratteristiche al momento in magazzino");
        }
        return searchModelResult;
    }
}