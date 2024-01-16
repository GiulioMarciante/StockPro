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
                    double display = scanner.nextDouble();
                    System.out.println("Inserisci dimensione memoria");
                    double memory = scanner.nextDouble();
                    System.out.println("Inserisci prezzo di acquisto");
                    double purPrice = scanner.nextDouble();
                    System.out.println("Inserisci prezzo di vendita");
                    double selPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Inserisci la descrizione del prodotto.(Per saltare questo punto premi invio)");
                    String description = scanner.nextLine();
                    insertItem();
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
            warehouse.itemsList().forEach(System.out::println);
        }
    }
    public void insertItem(){

    }
    public void searchByPurchasePrice(double purchasePrice){

    }
    public void  searchAverageExpense(){

    }
}