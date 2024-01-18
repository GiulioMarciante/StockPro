import java.util.Scanner;

public abstract class MenuManager implements Runnable {
    Warehouse warehouse = new Warehouse();
    CartManager cartManager = new CartManager();

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Benvenuto Magazziniere!");

        while (true) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Controlla Item in Magazzino");
            System.out.println("2. Inserisci Item");
            System.out.println("3. Ricerca per prezzo di acquisto");
            System.out.println("4. Ricerca spesa media per tipo di dispositivo");
            System.out.println("5. Esci");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkFullItemList();
                    break;
                case 2:
                    System.out.println("Inserisci il tipo");
                    String type = scanner.next();
                    System.out.println("Inserisci il brand");
                    String brand = scanner.next();
                    scanner.nextLine();
                    System.out.println("Inserisci il modello");
                    String model = scanner.nextLine();
                    System.out.println("Inserisci dimensione display");
                    Double display = scanner.nextDouble();
                    System.out.println("Inserisci dimensione memoria");
                    Double memory = scanner.nextDouble();
                    System.out.println("Inserisci prezzo di acquisto");
                    Double purPrice = scanner.nextDouble();
                    System.out.println("Inserisci prezzo di vendita");
                    Double selPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Inserisci la descrizione del prodotto.(La descrizione è facoltativa, se non si vuole inserire premere solo invio)");
                    String description = scanner.nextLine();
                    insertItem(type, brand, model, display, memory, purPrice, selPrice, description);

                    break;
                case 3:
                    System.out.println("Inserisci il prezzo da cercare nel magazzino");
                    double purchasePrice = scanner.nextDouble();
                    searchByPurchasePrice(purchasePrice);
                    break;
                case 4:
                    searchAverageExpense();
                    break;
                case 5:
                    System.out.println("Arrivederci Manager!");
                    return;
                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
        }

    }

    public void checkFullItemList() {
        if (warehouse.productList.isEmpty()) {
            System.out.println("Il magazzino è vuoto");
        } else {
            warehouse.itemsList().stream().map(Product::toStringManagerList).forEach(System.out::println);

        }
    }

    public void insertItem(String type, String brand, String model, Double display, Double memory, Double purPrice, Double selPrice, String description) {
        if ("Notebook".equalsIgnoreCase(type) || "Smartphone".equalsIgnoreCase(type) || "Tablet".equalsIgnoreCase(type)) {
            warehouse.addItem(type, brand, model, display, memory, purPrice, selPrice, description);
            System.out.println();
            System.out.println("Il prodotto è stato aggiunto al carrello! Arrivederci");
            System.out.println();
            System.out.println();
        } else {
            System.out.println("Inserimento non riuscito");
            System.out.println("Questo tipo di prodotto non esiste, è possibile aggiungere solo uno dei seguenti tipi:(Notebook, Smartphone, Tablet)");
        }
    }

    public void searchByPurchasePrice(double purchasePrice) {

    }

    public void searchAverageExpense() {

    }
}