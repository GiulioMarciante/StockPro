import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuChoice {
    public static void mainChoice() {
        menu();
    }
    public static void menu(){
        MenuUsers menuUsers = new MenuUsers() {};
        MenuManager menuManager = new MenuManager() {};
 //       try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Sei utente o magazziniere?");
            System.out.println("1.Utente");
            System.out.println("2.Magazziniere");

            int input = scanner.nextInt();

            while (input != 1 && input != 2) {
                System.out.println("Inserimento non valido. \nSe sei Utente inserisci 1, se sei Magazziniere inserisci 2.");
                input = scanner.nextInt();
                if (input == 1 || input == 2) {
                    break;
                }
            }
            if (input == 1) {
                menuUsers.run();
            } else if (input == 2) {
                menuManager.run();
            }
//        }catch (InputMismatchException e){
//            System.out.println("Inserire un valore numerivo valido per la scelta");
//            menu();
//        }
    }
}