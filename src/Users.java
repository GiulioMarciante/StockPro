import java.util.Scanner;

public abstract class Users implements Runnable{
    @Override
    public void run() {

        Warehouse warehouse = new Warehouse();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci il tuo nome");
        String nome = scanner.next();
        System.out.println("Ciao " + nome + ", che ricerca vuoi effettuare?");
        System.out.println("1.Item disponibili in Magazzino");
        System.out.println("2.Ricerca dispositivo per brand");
        System.out.println("3.Ricerca dispositivo per modello");
        System.out.println("4.Ricerca dispositivo per prezzo di vendita");
        System.out.println("5.Ricerca dispositivo per range di prezzo");
        System.out.println("6. Esci");

        int input = scanner.nextInt();

        switch (input) {
            case 1:
                warehouse.itemsList();
                break;
            case 2:
                checkBrand();
                break;
            case 3:
                checkModel();
                break;
            case 4:
                checkPrice();
                break;
            case 5:
                checkDeviceForType();
                break;
            case 6:
                System.out.println("Arrivederci " + nome);
                return;
            default:
                System.out.println("Opzione non valida. Riprova.");
                break;
        }
    }
    public void checkBrand(){

    }
    public void checkModel(){

    }
    public void checkPrice(){

    }
    public void checkDeviceForType(){

    }
}