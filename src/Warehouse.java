import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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


    public static void itemsList() {
        if (!deviceList.isEmpty()) {
            for (Device device : deviceList) {
                System.out.println(device);
            }

        } else {
            System.out.println("Il magazzino è vuoto");
        }
    }

    public static void searchDeviceType(TypesDevice type) {
        boolean foundDevice = false;

        for (Device device : deviceList) {
            switch (type) {
                case TABLET:
                case NOTEBOOK:
                case SMARTPHONE:
                    if (device.getType().equals(type)) {
                        System.out.println(device);
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
    }

    public static void searchDeviceBrand(String brand) {
        boolean foundDevice = false;
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
    }
    public static void searchDeviceModel(String model){
        List<Device> searchModelResult = new ArrayList<>();
        for(Device device : deviceList){
            if(device.getModel().equals(model)){
                searchModelResult.add(device);
                System.out.println(searchModelResult + "\nPer aggiungere il prodotto nel carrello usare l'id: " + device.getId());
            }
        }
        if(searchModelResult.isEmpty()){
            System.out.println("Non ci sono prodotti con queste caratteristiche al momento in magazzino");
        }
        //navigation();
    }
   /* public static void navigation(){
        System.out.println("Seleziona la prossima azione: '1' per continuare, '2' per aggiungere al carrello,'3' per rimuovere dal carrello ");
        char a = addToChart();
        char r = remoteFromChart();
        Scanner scanner = new Scanner(System.in);
        char characters = scanner.next().charAt(0);
    }*/

    public static void calculateAverage(String type){
        try{
            TypesDevice.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo non valido: " + type);
            return;
        }

        List<Device> typePrices = new ArrayList<>();
        double total = 0.0;


        for(Device device : deviceList){
            if(device.getType().name().equals(type.toUpperCase())){
                    typePrices.add(device);
                    total += device.getPurchasePrice();
            }
        }
            if (!typePrices.isEmpty()) {
                double average = total / typePrices.size();
                System.out.println("La media dei prezzi d'acquisto per " + type.toUpperCase() + " è: " + average);
                System.out.println("Hai ricercato i seguenti dispositivi: ");

                for (Device device : typePrices) {
                    System.out.println(device);
                }

            } else {
                System.out.println("Non ci sono dispositivi del tipo " + type.toUpperCase());
            }
        }
    }
