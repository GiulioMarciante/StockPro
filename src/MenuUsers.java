import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public abstract class MenuUsers implements Runnable {

    Warehouse warehouse = new Warehouse();
    CartManager cartManager = new CartManager();

    Cart cart = new Cart();

    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);

        String nome;
        System.out.println("Inserisci il tuo nome");
        nome = scanner.next();

        int intInput;
        boolean continueLoop = true;

        do {

            System.out.println("Ciao " + nome + ", che ricerca vuoi effettuare?");
            System.out.println("1.Item disponibili in Magazzino");
            System.out.println("2.Ricerca dispositivo per brand");
            System.out.println("3.Ricerca dispositivo per modello");
            System.out.println("4.Ricerca dispositivo per tipo di prodotto");
            System.out.println("5.Ricerca dispositivo per prezzo di vendita");
            System.out.println("6.Ricerca dispositivo per range prezzo di vendita");
            System.out.println("7.Inserisci Item nel carrello utilizzando l'id");
            System.out.println("8.Togli Item nel carrello utilizzando l'id");
            System.out.println("9.Finalizza l'acquisto");
            System.out.println("10. Esci");

            intInput = scanner.nextInt();

            switch (intInput) {
                case 1:
                    checkFullItemList();
                    break;
                case 2:
                    System.out.println("Scrivere il brand da ricercare");
                    String brand = scanner.next();
                    checkBrand(brand);
                    break;
                case 3:
                    System.out.println("Scrivere il modello da ricercare");
                    scanner.nextLine();
                    String model = scanner.nextLine();
                    checkModel(model);
                    break;
                case 4:
                    System.out.println("Scrivere il tipo da ricercare");
                    String inputType = scanner.next();
                    checkDeviceForType(inputType);
                    break;
                case 5:
                    System.out.println("Scrivi il prezzo da cercare nel magazzino");
                    Double salesPrice = scanner.nextDouble();
                    checkSalesPrice(salesPrice);
                    break;
                case 6:
                    System.out.println("Scrivi e invia il primo input per la ricerca");
                    Double inputOne = scanner.nextDouble();
                    System.out.println("Scrivi e invia il secondo input per la ricerca");
                    Double inputTwo = scanner.nextDouble();
                    checkForRangePrice(inputOne, inputTwo);
                    break;
                case 7:
                    System.out.println("Seleziona l'id del prodotto che hai scelto per inserirlo nel carrello");
                    int idToPut = scanner.nextInt();
                    putInCart(idToPut);
                    break;
                case 8:
                    System.out.println("Seleziona l'id del prodotto che vuoi togliere dal carrello");
                    int idToRemove = scanner.nextInt();
                    removeToCart(idToRemove);
                    break;
                case 9:
                    if(!cart.userCart.isEmpty()) {
                        continueLoop = false;
                    }
                    completeCheckout();
                    break;
                case 10:
                    System.out.println("Arrivederci " + nome);
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
        } while (continueLoop);
        scanner.close();
    }


    public void checkFullItemList() {
        if (warehouse.productList.isEmpty()) {
            System.out.println("Il magazzino è vuoto");
        } else {
            warehouse.itemsList().forEach(System.out::println);
        }
    }

    public void checkBrand(String brand) {
        List<Product> searchBrandResult = warehouse.searchDeviceBrand(brand);
        if (searchBrandResult.isEmpty()) {
            System.out.println("Non abbiamo questo brand");
        } else {
            searchBrandResult.forEach(System.out::println);
        }
    }

    public void checkModel(String model) {
        List<Product> searchModelResult = warehouse.searchDeviceModel(model);
        if (searchModelResult.isEmpty()) {
            System.out.println("Non abbiamo questo modello o scrivere correttamente rispettando gli spazi");
        } else {
            searchModelResult.forEach(System.out::println);
        }
    }

    public void checkDeviceForType(String inputType) {
        try {
            ProductTypes deviceType = ProductTypes.valueOf(inputType.toUpperCase());
            List<Product> searchTypeResult = warehouse.searchDeviceType(deviceType);

            if (searchTypeResult.isEmpty()) {
                System.out.println("Non abbiamo questo tipo di oggetto");
            } else {
                searchTypeResult.forEach(System.out::println);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo di dispositivo non valido: " + inputType);
        }
    }

    public void checkSalesPrice(Double salesPrice) {

        List<Product> result = warehouse.searchForSalesPrice(salesPrice);

        if (result.isEmpty()) {
            System.out.println("Nessun dispositivo con questo requisito");
        } else {
            result.forEach(System.out::println);
        }
    }

    public void checkForRangePrice(double inputOne, double inputTwo) {

        List<Product> result = warehouse.searchForRange(inputOne, inputTwo);

        if (result.isEmpty()) {
            System.out.println("Nessun dispositivo trovato in questo range di prezzo");
        } else {

            result.forEach(System.out::println);
        }
    }

    public void putInCart(int idToPut) {
        int initialCartSize = cart.userCart.size();
        List<Product> updatedCart = cartManager.intoCart(idToPut);
        int finalCartSize = cart.userCart.size();

        String message = (finalCartSize > initialCartSize) ?
                "Il prodotto è stato inserito correttamente nel carrello\n" :
                "L'id inserito non è esistente o è già presente nel carrello\n";

        System.out.println(message + "\nCarrello attuale:\n");
        updatedCart.forEach(product -> System.out.println(product + "\n"));
    }

    public void removeToCart(int idToRemove) {
        int initialCartSize = cart.userCart.size();
        List<Product> updatedCart = cartManager.outOfCart(idToRemove);
        int finalCartSize = cart.userCart.size();

        String message = (finalCartSize < initialCartSize) ?
                "Il prodotto è stato rimosso correttamente dal carrello\n" :
                "L'id inserito non è esistente o non è presente nel carrello\n";

        System.out.println(message + "\nCarrello attuale:\n");
        updatedCart.forEach(product -> System.out.println(product + "\n"));
    }

    public void completeCheckout() {
        BigDecimal totalCart = cartManager.totalCart();
        if(!cart.userCart.isEmpty()) {
            System.out.println("Prezzo totale:\n" + totalCart);
            cartManager.completePurchase();
            System.out.println("Grazie dell'acquisto, arrivederci!");
        } else {
            System.out.println("Il carrello non contiene alcun prodotto, impossibile completare l'acquisto\n");
        }
    }
}