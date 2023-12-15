import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {
   private static DeviceFakeDB demoItems = new DeviceFakeDB();
    static List<Device> deviceList = demoItems.getDeviceList();


    public static List<Device> itemsList() {
        List<Device> fullDeviceList = new ArrayList<>();
        if (!deviceList.isEmpty()) {
            for (Device device : deviceList) {
                fullDeviceList.add(device);
            }

        } else {
            System.out.println("Il magazzino è vuoto");
        }
        return fullDeviceList;
    }

    public static List<Device> searchDeviceType(DeviceTypes type) {
        boolean foundDevice = false;
        List<Device> searchDeviceTypeList = new ArrayList<>();

        for (Device device : deviceList) {
            switch (type) {
                case TABLET:
                case NOTEBOOK:
                case SMARTPHONE:
                    if (device.getType().equals(type)) {
                        searchDeviceTypeList.add(device);
                        foundDevice = true;
                    }
                    break;
                default:
                    break;
            }
        }
        if (!foundDevice) {
            System.out.println("Non ci sono prodotti con queste caratteristiche al momento in magazzino");
        }
        return searchDeviceTypeList;
    }

    public static List<Device> searchDeviceBrand(String brand) {
        List<Device> searchBrandResult = new ArrayList<>();
        String brandLowerCase = brand.toLowerCase();
        for (Device device : deviceList) {
            if (device.getBrand().toLowerCase().equals(brandLowerCase)) {
                searchBrandResult.add(device);
            }
        }
        if (searchBrandResult.isEmpty()) {
            System.out.println("Non ci sono prodotti con queste caratteristiche al momento in magazzino");
        }
        return searchBrandResult;
    }

    public static List<Device> searchDeviceModel(String model) {
        List<Device> searchModelResult = new ArrayList<>();
        String modelLowerCase = model.toLowerCase();
        for (Device device : deviceList) {
            if (device.getModel().toLowerCase().equals(modelLowerCase)) {
                searchModelResult.add(device);
                System.out.println(searchModelResult + "\nPer aggiungere questo prodotto nel carrello selezionare: " + device.getId());
            }
        }
        if (searchModelResult.isEmpty()) {
            System.out.println("Non ci sono prodotti con queste caratteristiche al momento in magazzino");

        }
        return searchModelResult;

    }

    public static List<Device> calculateAverage(String type) {
        try {
            DeviceTypes.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo non valido: " + type);
        }

        List<Device> typePrices = new ArrayList<>();
        double total = 0.0;


        for (Device device : deviceList) {
            if (device.getType().name().equals(type.toUpperCase())) {

                typePrices.add(device);
                total += device.getPurchasePrice();
            }
        }
        if (!typePrices.isEmpty()) {
            BigDecimal average = BigDecimal.valueOf(total / typePrices.size()).setScale(2, RoundingMode.HALF_EVEN);
            System.out.println("La media dei prezzi d'acquisto per " + type.toUpperCase() + " è: " + average);
            System.out.println("Hai ricercato i seguenti dispositivi: ");

            for (Device device : typePrices) {
                System.out.println(device);
            }

        } else {
            System.out.println("Non ci sono dispositivi del tipo " + type.toUpperCase());
        }
        return typePrices;
    }

    public static List<Device> searchForPurchasePrice(double abstractInput) {

        ArrayList<Device> result = new ArrayList<>();

        for (Device device : deviceList) {
            if (device.getPurchasePrice() <= abstractInput) {
                result.add(device);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Nessun dispositivo trovato con questa corrispondenza");
        }
        return result;
    }

    public static List<Device> searchForSalesPrice(double abstractInput) {

        ArrayList<Device> result = new ArrayList<>();

        for (Device device : deviceList) {
            if (device.getSalesPrice() <= abstractInput) {
                result.add(device);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Nessun dispositivo trovato con questa corrispondenza");
        }
        return result;
    }

    public static List<Device> searchForRange(double minImput, double maxImput) { //cambiare nome quando viene definito dall'imput.

        ArrayList<Device> result = new ArrayList<>();

        for (Device device : deviceList) {
            if (device.getSalesPrice() >= minImput && device.getSalesPrice() <= maxImput) {
                result.add(device);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Nessun dispositivo trovato con questa corrispondenza");
        }
        return result;
    }
    public static List<Device> addItem(DeviceTypes type, int id, String brand, String model, Double displayDimension, Double memoryDimension, Double purchasePrice, Double salesPrice) {

        Device item = new Device(type, id, brand, model, displayDimension, memoryDimension, purchasePrice, salesPrice);

        deviceList.add(item);

        return deviceList;
    }
}
