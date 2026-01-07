package Es2;

//Esercizio #2 - switch
//Scrivere un programma che chiede un intero in ingresso e lo stampa in lettere se il valore è compreso tra 0 e 3,
//altrimenti stampa un messaggio d'errore usando il costrutto switch.

import java.util.Scanner;

public class Es2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero tra 0 e 3 per stampare le sue lettere");
        int n = Integer.parseInt(scanner.nextLine());
        Es2 es2 = new Es2();
        es2.stampaLettere(n);

    }

    public void stampaLettere(int n) {
        switch (n) {
            case 0 -> System.out.println("Z E R O");
            case 1 -> System.out.println("U N O");
            case 2 -> System.out.println("D U E");
            case 3 -> System.out.println("T R E");
            default -> System.out.println("Errore, numero non accettato!");

        }
    }
}
