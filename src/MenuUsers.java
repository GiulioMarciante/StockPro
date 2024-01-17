import java.util.List;
import java.util.Scanner;

public abstract class MenuUsers implements Runnable{

    Warehouse warehouse = new Warehouse();

    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);

        String nome;
        System.out.println("Inserisci il tuo nome");
        nome = scanner.next();

        int intInput;

        do {

            System.out.println ("Ciao " + nome + ", che ricerca vuoi effettuare?");
            System.out.println ("1.Item disponibili in Magazzino");
            System.out.println ("2.Ricerca dispositivo per brand");
            System.out.println ("3.Ricerca dispositivo per modello");
            System.out.println ("4.Ricerca dispositivo per tipo di prodotto");
            System.out.println ("5.Ricerca dispositivo per prezzo di vendita");
            System.out.println ("6.Ricerca dispositivo per range prezzo di vendita");
            System.out.println ("7.Inserisci Item nel carrello utilizzando l'id");
            System.out.println ("8.Togli Item nel carrello utilizzando l'id");
            System.out.println ("9.Finalizza l'acquisto");
            System.out.println ("10. Esci");

            intInput = scanner.nextInt();

            switch (intInput) {
                case 1:
                    checkFullItemList ();
                    break;
                case 2:
                    System.out.println ("Scrivere il brand da ricercare");
                    String brand = scanner.next ();
                    checkBrand(brand);
                    break;
                case 3:
                    System.out.println ("Scrivere il modello da ricercare");
                    scanner.nextLine ();
                    String model = scanner.nextLine ();
                    checkModel(model);
                    break;
                case 4:
                    System.out.println ("Scrivere il tipo da ricercare");
                    String inputType = scanner.next ();
                    checkDeviceForType(inputType);
                    break;
                case 5:
                    System.out.println ("Scrivi il prezzo da cercare nel magazzino");
                    Double salesPrice  = scanner.nextDouble ();
                    checkSalesPrice(salesPrice);
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:
                    System.out.println("Arrivederci " + nome);
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
        } while (intInput != 9||intInput != 10);
                scanner.close ();
    }
    public void checkFullItemList() {
        if(warehouse.deviceList.isEmpty()) {
            System.out.println("Il magazzino è vuoto");
        }else {warehouse.itemsList().forEach(System.out::println);}
    }
    public void checkBrand(String brand){
        List<Device> searchBrandResult = warehouse.searchDeviceBrand (brand);
        if (searchBrandResult.isEmpty ()){
            System.out.println ("Non abbiamo questo brand");
        }else {
            searchBrandResult.forEach(System.out::println);
        }
    }
    public void checkModel(String model){
        List<Device> searchModelResult = warehouse.searchDeviceModel (model);
        if (searchModelResult.isEmpty ()){
            System.out.println ("Non abbiamo questo modello o scrivere correttamente rispettando gli spazi");
        }else {
            searchModelResult.forEach(System.out::println);
        }
    }
    public void checkDeviceForType(String inputType){
        try {
            DeviceTypes deviceType = DeviceTypes.valueOf(inputType.toUpperCase());
            List<Device> searchTypeResult = warehouse.searchDeviceType(deviceType);

            if (searchTypeResult.isEmpty()) {
                System.out.println("Non abbiamo questo tipo di oggetto");
            } else {
                searchTypeResult.forEach(System.out::println);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo di dispositivo non valido: " + inputType);
        }
    }
    public void checkSalesPrice(Double salesPrice){

        List<Device> result = warehouse.searchForSalesPrice (salesPrice);

        if (result.isEmpty ()){
            System.out.println ("Nessun dispositivo con questo requisito");
        }else {
            result.forEach (System.out::println);
        }
    }
}