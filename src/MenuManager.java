import java.util.Scanner;

public abstract class MenuManager implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        String id;
        System.out.println("Inserisci il ID");
        id = scanner.next();

        int intInput;

        do {

            System.out.println ("Ciao " + id + ", che ricerca vuoi effettuare?");
            System.out.println("1.Controlla prodotti presenti nel Magazzino");
            System.out.println("2.Ricerca per costo di acquisto");
            System.out.println("3.Ricerca spesa media per tipo di prodotto");
            System.out.println("4.Inserisci nuovo prodotto");
            System.out.println ("5. Esci");

            intInput = scanner.nextInt();

            switch (intInput) {
                case 1:
                    checkFullItemListManager();
                    break;
                case 2:
                    System.out.println ("Scrivere il costo di acquisto da ricercare");
                    Double inputPurchaisePrice = scanner.nextDouble();
                    checkPurchasePrice(inputPurchaisePrice);
                    break;
                case 3:
                    System.out.println ("Scrivere il tipo di prodotto di cui vuoi conoscere la spesa media di acquisto");
                    scanner.nextLine ();
                    String inputType = scanner.nextLine ();
                    checkAveragePriceType(inputType);
                    break;
                case 4:
                    addProduct();
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
        } while (intInput != 5);
        scanner.close ();
    }
    }
    public void checkFullItemListManager(){}
    public void checkPurchasePrice(Double inputPurchaisePrice){}
    public void  checkAveragePriceType(String inputType){
    DeviceTypes deviceTypes = 
    }
    public void addProduct(){}
}