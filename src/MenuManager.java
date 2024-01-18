import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class MenuManager implements Runnable {
    Warehouse warehouse = new Warehouse();
    CartManager cartManager = new CartManager();

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String id;
        System.out.println("Benvenuto Manager, inserisci il tuo ID");
        id = scanner.next();

        int intInput;

        do {
            System.out.println ("Ciao " + id + ", che operazione vuoi effettuare?");
            System.out.println("1.Controlla prodotti presenti nel magazzino");
            System.out.println("2.Ricerca per costo di acquisto");
            System.out.println("3.Ricerca costo medio di acquisto per tipo di prodotto");
            System.out.println("4.Inserisci nuovo prodotto");
            System.out.println ("5. Esci");

            intInput = scanner.nextInt();

            switch (intInput) {
                case 1:
                    checkFullItemListManager();
                    break;
                case 2:
                    System.out.println ("Scrivere il costo di acquisto da ricercare. Per i valori decimali utilizzare la virgola");
                    Double inputPurchaisePrice = scanner.nextDouble();
                    checkPurchasePrice(inputPurchaisePrice);
                    break;
                case 3:
                    System.out.println ("Scrivere il tipo di prodotto di cui vuoi conoscere il costo medio di acquisto scegliendo tra:");
                    System.out.println(java.util.Arrays.asList(ProductTypes.values()));
                    scanner.nextLine ();
                    String inputType = scanner.nextLine ();
                    checkAveragePriceType(inputType);
                    break;
                case 4:
                    System.out.println("Inserisci il tipo di prodotto scegliendo tra");
                    System.out.println(java.util.Arrays.asList(ProductTypes.values()));
                    String type = scanner.next();
                    System.out.println("Inserisci il brand");
                    String brand = scanner.next();
                    scanner.nextLine();
                    System.out.println("Inserisci il modello");
                    String model = scanner.nextLine();
                    System.out.println("Inserisci dimensione display. Per i valori decimali utilizzare la virgola");
                    Double display = scanner.nextDouble();
                    System.out.println("Inserisci dimensione memoria. Per i valori decimali utilizzare la virgola");
                    Double memory = scanner.nextDouble();
                    System.out.println("Inserisci costo di acquisto. Per i valori decimali utilizzare la virgola");
                    Double purPrice = scanner.nextDouble();
                    System.out.println("Inserisci prezzo di vendita. Per i valori decimali utilizzare la virgola");
                    Double selPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Inserisci la descrizione del prodotto.(La descrizione è facoltativa, se non si vuole inserire premere solo invio)");
                    String description = scanner.nextLine();
                    insertItem(type, brand, model, display, memory, purPrice, selPrice, description);
                    break;
                case 5:
                    System.out.println("Arrivederci Manager!");
                    return;
                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
        } while (intInput != 5);
        scanner.close ();
    }
    public void checkFullItemListManager() {
        if (warehouse.productList.isEmpty()) {
            System.out.println("Il magazzino è vuoto");
        } else {
            warehouse.itemsList().stream().map(Product::toStringManagerList).forEach(System.out::println);

        }
    }
    public void checkPurchasePrice(double purchasePrice) {
        List<Product> serchPurchasePriceResult = warehouse.searchForPurchasePrice(purchasePrice);
        if(serchPurchasePriceResult.isEmpty()){
            System.out.println("Non é stato trovato alcun prodotto al di sotto di questo prezzo");
        }else{
            serchPurchasePriceResult.forEach(System.out::println);
        }
    }
    public void checkAveragePriceType(String inputStringType){
        try {
            ProductTypes inputType = ProductTypes.valueOf(inputStringType.toUpperCase());
            List<Product> searchTypeResult = warehouse.searchDeviceType(inputType);

            System.out.println("Il costo medio di spesa per " + inputStringType + " é di " + warehouse.calculateAverage(inputStringType) + " e comprende:");
            warehouse.searchDeviceType(inputType).forEach(System.out::println);

        }catch (Exception e){
            System.out.println("Tipo di dispositivo non trovato: " + inputStringType);
        }
    }
    public void insertItem(String type, String brand, String model, Double display, Double memory, Double purPrice, Double selPrice, String description) {
        String inputType = type.toUpperCase();
        if (Arrays.asList(ProductTypes.values()).toString().contains(inputType)) {
            ProductTypes productTypes = ProductTypes.fromString(type);
            warehouse.addItem(productTypes, brand, model, display, memory, purPrice, selPrice, description);
            System.out.println();
            System.out.println("Il prodotto è stato aggiunto al magazzino! Arrivederci");
            System.out.println();
        } else {
            System.out.println("Inserimento non riuscito");
            System.out.println("Questo tipo di prodotto non esiste, è possibile aggiungere solo uno dei seguenti tipi:");
            System.out.println(java.util.Arrays.asList(ProductTypes.values()));
        }
    }
}