import java.util.Scanner;

public class Choice {
    public static void mainChoice() {

        Users user = new Users() {};
        Manager manager = new Manager() {};

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
            user.run();
        }else if(input==2){
            manager.run();
        }
    }
}