import java.util.Scanner;

public class Interface {
    Warehouse warehouse = new Warehouse();
    CartManager cartManager = new CartManager();

    public void createInterface() {

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

            input = scanner.nextInt();
            while (input != 1 && input != 2 && input != 3 && input != 4 && input != 5 && input != 9) {
                System.out.println("Inserimento non valido, inserisci uno di questi numeri!");
                System.out.println("1.Item disponibili in Magazzino");
                System.out.println("2.Ricerca dispositivo per brand");
                System.out.println("3.Ricerca dispositivo per modello");
                System.out.println("4.Ricerca dispositivo per prezzo di vendita");
                System.out.println("5.Ricerca dispositivo per range di prezzo");
                System.out.println("9.Non devo fare altro!");
                input = scanner.nextInt();
            }
            while (true) {
                if (input == 1) {
                    System.out.println("Questa è lista di tutti gli items presenti in magazzino");
                    warehouse.itemsList().forEach(System.out::println);
                    System.out.println("Questo è il risultato della tua ricerca!");
                    System.out.println();
                    System.out.println("Vuoi fare altro?");
                    System.out.println("2.Ricerca dispositivo per brand");
                    System.out.println("3.Ricerca dispositivo per modello");
                    System.out.println("4.Ricerca dispositivo per prezzo di vendita");
                    System.out.println("5.Ricerca dispositivo per range di prezzo");
                    System.out.println("6.Inserisci Item nel carrello utilizzando l'id");
                    System.out.println("7.Togli Item nel carrello utilizzando l'id");
                    System.out.println("8.Finalizza acquisto");
                    System.out.println("9.Non devo fare altro!");
                    System.out.println();
                    System.out.println("Questo è il tuo carrello al momento");
                    Cart.userCart.forEach(System.out::println);

                    input = scanner.nextInt();
                } else if (input == 2) {
                    System.out.println("Inserisci il nome del brand a cui sei interessato!");
                    warehouse.searchDeviceBrand(scanner.next()).forEach(System.out::println);
                    System.out.println("Questo è il risultato della tua ricerca!");
                    System.out.println();
                    System.out.println("Vuoi fare altro?");
                    System.out.println("1.Item disponibili in Magazzino");
                    System.out.println("3.Ricerca dispositivo per modello");
                    System.out.println("4.Ricerca dispositivo per prezzo di vendita");
                    System.out.println("5.Ricerca dispositivo per range di prezzo");
                    System.out.println("6.Inserisci Item nel carrello utilizzando l'id");
                    System.out.println("7.Togli Item nel carrello utilizzando l'id");
                    System.out.println("8.Finalizza acquisto");
                    System.out.println("9.Non devo fare altro!");
                    System.out.println();
                    System.out.println("Questo è il tuo carrello al momento");
                    Cart.userCart.forEach(System.out::println);
                    input = scanner.nextInt();

                } else if (input == 3) {
                    scanner.nextLine();
                    System.out.println("Inserisci il nome del modello a cui sei interessato!");
                    warehouse.searchDeviceModel(scanner.nextLine()).forEach(System.out::println);
                    System.out.println("Questo è il risultato della tua ricerca!");
                    System.out.println();
                    System.out.println("Vuoi fare altro?");
                    System.out.println("1.Item disponibili in Magazzino");
                    System.out.println("2.Ricerca dispositivo per brand");
                    System.out.println("4.Ricerca dispositivo per prezzo di vendita");
                    System.out.println("5.Ricerca dispositivo per range di prezzo");
                    System.out.println("6.Inserisci Item nel carrello utilizzando l'id");
                    System.out.println("7.Togli Item nel carrello utilizzando l'id");
                    System.out.println("8.Finalizza acquisto");
                    System.out.println("9.Non devo fare altro!");
                    System.out.println();
                    System.out.println("Questo è il tuo carrello al momento");
                    Cart.userCart.forEach(System.out::println);
                    input = scanner.nextInt();

                } else if (input == 4) {
                    System.out.println("Ricerca per prezzo di vendita, inserire un prezzo di ricerca!");
                    warehouse.searchForSalesPrice(scanner.nextInt()).forEach(System.out::println);
                    System.out.println("Questo è il risultato della tua ricerca!");
                    System.out.println();
                    System.out.println("Vuoi fare altro?");
                    System.out.println("1.Item disponibili in Magazzino");
                    System.out.println("2.Ricerca dispositivo per brand");
                    System.out.println("3.Ricerca dispositivo per modello");
                    System.out.println("5.Ricerca dispositivo per range di prezzo");
                    System.out.println("6.Inserisci Item nel carrello utilizzando l'id");
                    System.out.println("7.Togli Item nel carrello utilizzando l'id");
                    System.out.println("8.Finalizza acquisto");
                    System.out.println("9.Non devo fare altro!");
                    System.out.println();
                    System.out.println("Questo è il tuo carrello al momento");
                    Cart.userCart.forEach(System.out::println);
                    input = scanner.nextInt();

                } else if (input == 5) {
                    System.out.println("Ricerca per range di prezzo, inserire un valore di ricerca per volta!");
                    warehouse.searchForRange(scanner.nextInt(), scanner.nextInt()).forEach(System.out::println);
                    System.out.println("Questo è il risultato della tua ricerca!");
                    System.out.println();
                    System.out.println("Vuoi fare altro?");
                    System.out.println("1.Item disponibili in Magazzino");
                    System.out.println("2.Ricerca dispositivo per brand");
                    System.out.println("3.Ricerca dispositivo per modello");
                    System.out.println("4.Ricerca dispositivo per prezzo di vendita");
                    System.out.println("6.Inserisci Item nel carrello utilizzando l'id");
                    System.out.println("7.Togli Item nel carrello utilizzando l'id");
                    System.out.println("8.Finalizza acquisto");
                    System.out.println("9.Non devo fare altro!");
                    System.out.println();
                    System.out.println("Questo è il tuo carrello al momento");
                    Cart.userCart.forEach(System.out::println);
                    input = scanner.nextInt();

                } else if (input == 6) {
                    System.out.println("Inserisci l'id dell'oggetto che vuoi aggiungere al tuo carrello");
                    cartManager.intoCart(scanner.nextInt());
                    System.out.println("L'oggetto è stato aggiunto al tuo carrello");
                    System.out.println();
                    System.out.println("Vuoi fare altro?");
                    System.out.println("1.Item disponibili in Magazzino");
                    System.out.println("2.Ricerca dispositivo per brand");
                    System.out.println("3.Ricerca dispositivo per modello");
                    System.out.println("4.Ricerca dispositivo per prezzo di vendita");
                    System.out.println("5.Ricerca dispositivo per range di prezzo");
                    System.out.println("7.Togli Item nel carrello utilizzando l'id");
                    System.out.println("8.Finalizza acquisto");
                    System.out.println("9.Non devo fare altro!");
                    System.out.println();
                    System.out.println("Questo è il tuo carrello al momento");
                    Cart.userCart.forEach(System.out::println);
                    input = scanner.nextInt();

                } else if (input == 7) {
                    System.out.println("Inserisci l'id dell'oggetto che vuoi eliminare dal tuo carrello");
                    cartManager.outOfCart(scanner.nextInt());
                    System.out.println("L'oggetto è stato aggiunto al tuo carrello");
                    System.out.println();
                    System.out.println("Vuoi fare altro?");
                    System.out.println("1.Item disponibili in Magazzino");
                    System.out.println("2.Ricerca dispositivo per brand");
                    System.out.println("3.Ricerca dispositivo per modello");
                    System.out.println("4.Ricerca dispositivo per prezzo di vendita");
                    System.out.println("5.Ricerca dispositivo per range di prezzo");
                    System.out.println("6.Inserisci Item nel carrello utilizzando l'id");
                    System.out.println("8.Finalizza acquisto");
                    System.out.println("9.Non devo fare altro!");
                    System.out.println();
                    System.out.println("Questo è il tuo carrello al momento");
                    Cart.userCart.forEach(System.out::println);
                    input = scanner.nextInt();

                } else if (input == 8) {
                    System.out.println("8.Finalizza acquisto");
                    cartManager.completePurchase();
                    System.out.println("Buona giornata " + nome + "\n Grazie per avere acquistato da noi. Torna presto!");
                   break;


                } else if (input == 9) {
                    System.out.println("Buona giornata " + nome + "\n Torna presto!");
                    break;

                } else {
                    System.out.println("Inserimento non valido, inserisci uno di questi numeri!");
                    System.out.println("1.Item disponibili in Magazzino");
                    System.out.println("2.Ricerca dispositivo per brand");
                    System.out.println("3.Ricerca dispositivo per modello");
                    System.out.println("4.Ricerca dispositivo per prezzo di vendita");
                    System.out.println("5.Ricerca dispositivo per range di prezzo");
                    System.out.println("9.Non devo fare altro!");
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
                                warehouse.itemsList().forEach(System.out::println);
                                System.out.println("Questo è il risultato della tua ricerca!");
                                System.out.println();

                                System.out.println("Vuoi fare altro?");
                                System.out.println("2.Inserisci Item");
                                System.out.println("3.Ricerca per prezzo di acquisto");
                                System.out.println("4.Ricerca spesa media per tipo di dispositivo");
                                System.out.println("5.Non devo fare altro!");
                                input = scanner.nextInt();
                            } else if (input == 2) {
                                System.out.println("Inserisci le informazioni dell'item da aggiungere al magazzino seguendo l'ordine dell'esempio, premendo invio per ogni dato inserito");
                                System.out.println("Nootebook(tipo), 3(id), hp(brand), pavillion(modello), 15,6(dimensione display), 500,0(dimensione memoria), 200,0(prezzo di acquisto), 500,0(prezzo di vendita)");
                                warehouse.addItem(scanner.next(),scanner.nextInt(),scanner.next(),scanner.next(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
                                System.out.println();
                                System.out.println("Vuoi fare altro?");
                                System.out.println("1.Controlla Item in Magazzino");
                                System.out.println("2.Inserisci un altro Item");
                                System.out.println("3.Ricerca per prezzo di acquisto");
                                System.out.println("4.Ricerca spesa media per tipo di dispositivo");
                                System.out.println("5.Non devo fare altro!");
                                input = scanner.nextInt();
                            } else if (input == 3) {
                                System.out.println("Ricerca per prezzo d'acquisto, inserire un prezzo di ricerca!");
                                warehouse.searchForPurchasePrice(scanner.nextInt()).forEach(System.out::println);
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
                                warehouse.calculateAverage(scanner.next()).forEach(System.out::println);
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
