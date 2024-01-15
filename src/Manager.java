import java.util.Scanner;

public abstract class Manager implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Warehouse warehouse = new Warehouse();

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
                    warehouse.itemsList();
                    break;
                case 2:
                    insertItem();
                    break;
                case 3:
                    searchByPurchasePrice();
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
    public void insertItem(){

    }
    public void searchByPurchasePrice(){

    }
    public void  searchAverageExpense(){

    }
}