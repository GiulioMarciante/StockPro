import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class Warehouse {
    private static DemoItems demoItems = new DemoItems();
    static List<Device> deviceList = demoItems.getDeviceList();


    public List<Device> itemsList() {
        return new ArrayList<>(deviceList);
    }

    public List<Device> searchDeviceType(DeviceTypes type) {
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
        return searchBrandResult;
    }

    public List<Device> searchDeviceModel(String model) {
        List<Device> searchModelResult = new ArrayList<>();
        String modelLowerCase = model.toLowerCase();
        for (Device device : deviceList) {
            if (device.getModel().toLowerCase().equals(modelLowerCase)) {
                searchModelResult.add(device);
            }
        }
        return searchModelResult;

    }

    public List<Device> calculateAverage(String type) {

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

        } else {
            System.out.println("Non ci sono dispositivi del tipo " + type.toUpperCase());
        }
        return typePrices;
    }

    public List<Device> searchForPurchasePrice(double input) {

        ArrayList<Device> result = new ArrayList<>();

        for (Device device : deviceList) {
            if (device.getPurchasePrice() <= input) {
                result.add(device);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Nessun dispositivo trovato con questa corrispondenza");
        }
        return result;
    }

    public List<Device> searchForSalesPrice(double input) {

        ArrayList<Device> result = new ArrayList<>();

        for (Device device : deviceList) {
            if (device.getSalesPrice() <= input) {
                result.add(device);
            }
        }
        return result;
    }

    public List<Device> searchForRange(double minInput, double maxInput) {

        List<Device> result = new ArrayList<>();

        for (Device device : deviceList) {
            if(minInput>maxInput) {
                if (device.getSalesPrice() >= maxInput && device.getSalesPrice() <= minInput) {
                    result.add(device);
                }
            }else{
                if (device.getSalesPrice() >= minInput && device.getSalesPrice() <= maxInput) {
                result.add(device);
                }
            }
        }
        return result;
    }

    public void addItem(String type, String brand, String model, Double displayDimension, Double memoryDimension, Double purchasePrice, Double salesPrice) {

        if ("Notebook".equalsIgnoreCase(type) || "Smartphone".equalsIgnoreCase(type) || "Tablet".equalsIgnoreCase(type)) {
            DeviceTypes deviceTypes = DeviceTypes.fromString(type);
            BuilderDevice builder = new BuilderDevice(deviceTypes, brand, model, displayDimension, memoryDimension, purchasePrice, salesPrice);
            Device item = builder.build();
            deviceList.add(item);
        } else {
            System.out.println("Tipo errato.");
        }
    }



}
