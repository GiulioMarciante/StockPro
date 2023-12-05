import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Warehouse {
   private static DemoItems demoItems = new DemoItems();
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

    public static List<Device> searchDeviceType(TypesDevice type) {
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

    public List<Device> searchDeviceBrand(String brand) {
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
//        try {
//            TypesDevice.valueOf(type.toUpperCase());
//        } catch (IllegalArgumentException e) {
//            System.out.println("Tipo non valido: " + type);
//            return;
//        }

        List<Device> typePrices = new ArrayList<>();
        double total = 0.0;


        for (Device device : deviceList) {
            if (device.getType().name().equals(type.toUpperCase())) {

                typePrices.add(device);
                total += device.getPurchasePrice();
            }
        }
        if (!typePrices.isEmpty()) {
            double average = total / typePrices.size();
            System.out.println("La media dei prezzi d'acquisto per " + type.toUpperCase() + " è: " + average);
            System.out.println("Hai ricercato i seguenti dispositivi: ");

//            for (Device device : typePrices) {
//                System.out.println(device);
//            }

        } else {
            System.out.println("Non ci sono dispositivi del tipo " + type.toUpperCase());
        }
        return typePrices;
    }

    public static List<Device> serchForPurchasePrice(double abstractImput) { //cambiare nome quando viene definito dall'imput.

        ArrayList<Device> result = new ArrayList<>();

        for (Device device : deviceList) {
            if (device.purchasePrice <= abstractImput) {
                result.add(device);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Nessun dispositivo trovato con questa corrispondenza");
        }
        return result;
    }

    public static List<Device> serchForSalesPrice(double abstractImput1) { //cambiare nome quando viene definito dall'imput.

        ArrayList<Device> result = new ArrayList<>();

        for (Device device : deviceList) {
            if (device.salesPrice <= abstractImput1) {
                result.add(device);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Nessun dispositivo trovato con questa corrispondenza");
        }
        return result;
    }

    public static List<Device> serchForRange(double minImput, double maxImput) { //cambiare nome quando viene definito dall'imput.

        ArrayList<Device> result = new ArrayList<>();

        for (Device device : deviceList) {
            if (device.salesPrice >= minImput && device.salesPrice <= maxImput) {
                result.add(device);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Nessun dispositivo trovato con questa corrispondenza");
        }
        return result;
    }
}
