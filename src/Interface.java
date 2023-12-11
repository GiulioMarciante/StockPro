import java.util.Scanner;

public class Interface {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sei utente o magazziniere?");
        System.out.println("1.Utente");
        System.out.println("2.Magazziniere");
        int input = scanner.nextInt();
        while (input != 1 && input != 2) {
            System.out.println("Inserimento non valido");
            input = scanner.nextInt();
            if (input == 1 || input == 2) {
                break;
            }
        }
        if (input == 1) {
            System.out.println("Inserisci il tuo nome");
            String nome = scanner.next();
            System.out.println("Ciao " + nome + ", che ricerca vuoi effettuare?");
            System.out.println("1.Item disponibili in Magazzino");
            System.out.println("2.Ricerca dispositivo per brand");
            System.out.println("3.Ricerca dispositivo per modello");
            System.out.println("4.Ricerca dispositivo per prezzo di vendita");
            System.out.println("5.Ricerca dispositivo per range di prezzo");
            System.out.println("6.Non devo fare altro!");
            input = scanner.nextInt();
            while (input != 1 && input != 2 && input != 3 && input != 4 && input != 5 && input != 6) {
                System.out.println("Inserimento non valido, inserisci uno di questi numeri!");
                System.out.println("1.Item disponibili in Magazzino");
                System.out.println("2.Ricerca dispositivo per brand");
                System.out.println("3.Ricerca dispositivo per modello");
                System.out.println("4.Ricerca dispositivo per prezzo di vendita");
                System.out.println("5.Ricerca dispositivo per range di prezzo");
                System.out.println("6.Non devo fare altro!");
                input = scanner.nextInt();
            }
            while (true) {
                if (input == 1) {
                    System.out.println("Questa è lista di tutti gli items presenti in magazzino");
                    Warehouse.itemsList().forEach(System.out::println);
                    System.out.println("Questo è il risultato della tua ricerca!");
                    System.out.println();
                    System.out.println("Vuoi fare altro?");
                    System.out.println("2.Ricerca dispositivo per brand");
                    System.out.println("3.Ricerca dispositivo per modello");
                    System.out.println("4.Ricerca dispositivo per prezzo di vendita");
                    System.out.println("5.Ricerca dispositivo per range di prezzo");
                    System.out.println("6.Non devo fare altro!");
                    input = scanner.nextInt();
                } else if (input == 2) {
                    System.out.println("Inserisci il nome del brand a cui sei interessato!");
                    Warehouse.searchDeviceBrand(scanner.next()).forEach(System.out::println);
                    System.out.println("Questo è il risultato della tua ricerca!");
                    System.out.println();
                    System.out.println("Vuoi fare altro?");
                    System.out.println("1.Item disponibili in Magazzino");
                    System.out.println("3.Ricerca dispositivo per modello");
                    System.out.println("4.Ricerca dispositivo per prezzo di vendita");
                    System.out.println("5.Ricerca dispositivo per range di prezzo");
                    System.out.println("6.Non devo fare altro!");
                    input = scanner.nextInt();

                } else if (input == 3) {
                    scanner.nextLine();
                    System.out.println("Inserisci il nome del modello a cui sei interessato!");
                    Warehouse.searchDeviceModel(scanner.nextLine()).forEach(System.out::println);
                    System.out.println("Questo è il risultato della tua ricerca!");
                    System.out.println();
                    System.out.println("Vuoi fare altro?");
                    System.out.println("1.Item disponibili in Magazzino");
                    System.out.println("2.Ricerca dispositivo per brand");
                    System.out.println("4.Ricerca dispositivo per prezzo di vendita");
                    System.out.println("5.Ricerca dispositivo per range di prezzo");
                    System.out.println("6.Non devo fare altro!");
                    input = scanner.nextInt();

                } else if (input == 4) {
                    System.out.println("Ricerca per prezzo di vendita, inserire un prezzo di ricerca!");
                    Warehouse.searchForSalesPrice(scanner.nextInt()).forEach(System.out::println);
                    System.out.println("Questo è il risultato della tua ricerca!");
                    System.out.println();
                    System.out.println("Vuoi fare altro?");
                    System.out.println("1.Item disponibili in Magazzino");
                    System.out.println("2.Ricerca dispositivo per brand");
                    System.out.println("3.Ricerca dispositivo per modello");
                    System.out.println("5.Ricerca dispositivo per range di prezzo");
                    System.out.println("6.Non devo fare altro!");
                    input = scanner.nextInt();

                } else if (input == 5) {
                    System.out.println("Ricerca per range di prezzo, inserire un valore di ricerca per volta!");
                    Warehouse.searchForRange(scanner.nextInt(), scanner.nextInt()).forEach(System.out::println);
                    System.out.println("Questo è il risultato della tua ricerca!");
                    System.out.println();
                    System.out.println("Vuoi fare altro?");
                    System.out.println("1.Item disponibili in Magazzino");
                    System.out.println("2.Ricerca dispositivo per brand");
                    System.out.println("3.Ricerca dispositivo per modello");
                    System.out.println("4.Ricerca dispositivo per prezzo di vendita");
                    System.out.println("6.Non devo fare altro!");
                    input = scanner.nextInt();

                } else if (input == 6) {
                    System.out.println("Buona giornata " + nome + "\n Torna presto!");
                    break;

                } else {
                    System.out.println("Inserimento non valido, inserisci uno di questi numeri!");
                    System.out.println("1.Item disponibili in Magazzino");
                    System.out.println("2.Ricerca dispositivo per brand");
                    System.out.println("3.Ricerca dispositivo per modello");
                    System.out.println("4.Ricerca dispositivo per prezzo di vendita");
                    System.out.println("5.Ricerca dispositivo per range di prezzo");
                    System.out.println("6.Non devo fare altro!");
                    input = scanner.nextInt();
                }
            }

        } else if (input == 2) {
            System.out.println("Inserisci Id");
            int idMag = scanner.nextInt();
            while (idMag != 12) {
                System.out.println("Id inesistente, inserisci l'Id corretto");
                idMag = scanner.nextInt();
                if (idMag == 12) break;
            }
            switch (idMag) {
                case 12:
                    System.out.println("Inserisci password");
                    String passwd = scanner.next();
                    while (!passwd.equals("passwd")) {
                        System.out.println("Password errata, reinserisci la password corretta!");
                        passwd = scanner.next();
                        if (passwd.equals("passwd")) break;
                    }
                    if (passwd.equals("passwd")) {
                        System.out.println("Ciao, cosa vuoi fare?");
                        System.out.println("1.Controlla Item in Magazzino");
                        System.out.println("2.Inserisci Item");
                        System.out.println("3.Ricerca per prezzo di acquisto");
                        System.out.println("4.Ricerca spesa media per tipo di dispositivo");
                        System.out.println("5.Non devo fare altro!");
                        input = scanner.nextInt();
                        while (input != 1 && input != 2 && input != 3 && input != 4 && input != 5) {
                            System.out.println("Inserimento non valido, inserisci uno di questi numeri!");
                            input = scanner.nextInt();
                        }
                        while (true) {
                            if (input == 1) {
                                System.out.println("Questa è lista di tutti gli items presenti in magazzino");
                                Warehouse.itemsList().forEach(System.out::println);
                                System.out.println("Questo è il risultato della tua ricerca!");
                                System.out.println();

                                System.out.println("Vuoi fare altro?");
                                System.out.println("2.Inserisci Item");
                                System.out.println("3.Ricerca per prezzo di acquisto");
                                System.out.println("4.Ricerca spesa media per tipo di dispositivo");
                                System.out.println("5.Non devo fare altro!");
                                input = scanner.nextInt();
                            } else if (input == 2) {
                                System.out.println("Inserisci (l'Id)? dell'item da aggiungere al magazzino");
                                System.out.println("Questo è il risultato della tua ricerca!");
                                System.out.println();

                                System.out.println("Vuoi fare altro?");
                                System.out.println("1.Controlla Item in Magazzino");
                                System.out.println("3.Ricerca per prezzo di acquisto");
                                System.out.println("4.Ricerca spesa media per tipo di dispositivo");
                                System.out.println("5.Non devo fare altro!");
                                input = scanner.nextInt();
                            } else if (input == 3) {
                                System.out.println("Ricerca per prezzo d'acquisto, inserire un prezzo di ricerca!");
                                Warehouse.searchForPurchasePrice(scanner.nextInt()).forEach(System.out::println);
                                System.out.println("Questo è il risultato della tua ricerca!");
                                System.out.println();

                                System.out.println("Vuoi fare altro?");
                                System.out.println("1.Controlla Item in Magazzino");
                                System.out.println("2.Inserisci Item");
                                System.out.println("4.Ricerca spesa media per tipo di dispositivo");
                                System.out.println("5.Non devo fare altro!");
                                input = scanner.nextInt();
                            } else if (input == 4) {
                                System.out.println("Ricerca spesa media per tipo di dispositivo, inserire un tipo per la ricerca(notebook, smartphone, tablet) ");
                                Warehouse.calculateAverage(scanner.next()).forEach(System.out::println);
                                System.out.println("Questo è il risultato della tua ricerca!");
                                System.out.println();

                                System.out.println("Vuoi fare altro?");
                                System.out.println("1.Controlla Item in Magazzino");
                                System.out.println("2.Inserisci Item");
                                System.out.println("3.Ricerca per prezzo di acquisto");
                                System.out.println("5.Non devo fare altro!");
                                input = scanner.nextInt();
                            } else if (input == 5) {
                                System.out.println("Buona giornata!");
                                break;
                            } else {
                                System.out.println("Inserimento non valido, inserire uno di questi numeri!");
                                System.out.println("1.Controlla Item in Magazzino");
                                System.out.println("2.Inserisci Item");
                                System.out.println("3.Ricerca per prezzo di acquisto");
                                System.out.println("4.Ricerca spesa media per tipo di dispositivo");
                                System.out.println("5.Non devo fare altro!");
                                input = scanner.nextInt();
                            }
                        }
                    }
            }
        }
    }
}
