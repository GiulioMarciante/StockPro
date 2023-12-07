import java.util.Scanner;

public class Interface {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sei utente o magazziniere?(Digita '1' se sei Utente o '2' se sei Magazziniere");
        int input1 = scanner.nextInt();
        while (input1 != 1 && input1 != 2) {
            System.out.println("Inserimento non valido");
            input1 = scanner.nextInt();
            if (input1 == 1 || input1 == 2) {
                break;
            }
        }
        if (input1 == 1) {
            System.out.println("Inserisci il tuo nome");
            String nome = scanner.next();
        } else if (input1 == 2) {
            System.out.println("Inserisci Id");
            int idMag = scanner.nextInt();
            while (idMag != 12) {
                System.out.println("Id inesistente");
                idMag = scanner.nextInt();
                if (idMag == 12) break;
            }
            switch (idMag) {
                case 12:
                    System.out.println("Inserisci password");
                    String passwd = scanner.next();
                    while (!passwd.equals("passwd")) {
                        System.out.println("Password errata! Reinserisci la password corretta");
                        passwd = scanner.next();
                        if (passwd.equals("passwd")) break;
                    }
                    if (passwd.equals("passwd")) {
                        System.out.println("Ciao, cosa vuoi fare?");
                        System.out.println("1.Controlla Item in Magazzino");
                        System.out.println("2.Inserisci Item");
                        System.out.println("3.Ricerca per prezzo di acquisto");
                        System.out.println("4.Ricerca spesa media per tipo di dispositivo");
                        System.out.println("5.Chiudi il programma");
                        int input2 = scanner.nextInt();
                        while (input2 != 1 && input2 != 2 && input2 != 3 && input2 != 4 && input2 != 5) {
                            System.out.println("Inserimento non valido");
                            input2 = scanner.nextInt();
                            if (input2 == 1 || input1 == 2 || input1 == 3 || input1 == 4 || input1 == 5) {
                                break;
                            }
                        }
                        //da qui in poi non funziona ancora, la parte di sopra dovrebbe!     id=12, password=passwd

                        if (input2 == 1) {
                            Warehouse.itemsList().forEach(System.out::println); //funzione che vede tutti gli items con tutti i prezzi
                            System.out.println("Vuoi fare altro?");
                            System.out.println("2.Inserisci Item");
                            System.out.println("3.Ricerca per prezzo di acquisto");
                            System.out.println("4.Ricerca spesa media per tipo di dispositivo");
                            System.out.println("5.Chiudi il programma");
                            input2 = scanner.nextInt();
                        } else if (input2 == 2) {
                            // ancora da fare
                            System.out.println("Vuoi fare altro?");
                            System.out.println("1.Controlla Item in Magazzino");
                            System.out.println("3.Ricerca per prezzo di acquisto");
                            System.out.println("4.Ricerca spesa media per tipo di dispositivo");
                            System.out.println("5.Chiudi il programma");
                            input2 = scanner.nextInt();
                        } else if (input2 == 3) {
                            Warehouse.serchForPurchasePrice(scanner.nextInt());
                            System.out.println("Vuoi fare altro?");
                            System.out.println("1.Controlla Item in Magazzino");
                            System.out.println("2.Inserisci Item");
                            System.out.println("4.Ricerca spesa media per tipo di dispositivo");
                            System.out.println("5.Chiudi il programma");
                            input2 = scanner.nextInt();
                        } else if (input2 == 4) {
                            Warehouse.calculateAverage(scanner.next());
                            System.out.println("Vuoi fare altro?");
                            System.out.println("1.Controlla Item in Magazzino");
                            System.out.println("2.Inserisci Item");
                            System.out.println("3.Ricerca per prezzo di acquisto");
                            System.out.println("5.Chiudi il programma");
                            input2 = scanner.nextInt();
                        } else if (input2 == 5) {
                            break;
                        }
                    }

            }
        }
    }

}
