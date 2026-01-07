package Es3;

//Esercizio #3 - while
//Scrivere un programma che chiede di inserire una stringa e la suddivida in caratteri separati dalla virgola.
//Il programma si ripete fino a che l'utente non inserisce la stringa ":q"'

import java.util.Scanner;

public class Es3 {
    static void main() {
        Es3 es3 = new Es3();
        es3.separaCaratteri();
    }

    public void separaCaratteri() {
        Scanner scanner = new Scanner(System.in);
        int indice = 0;
        String parola = "";
        while (!parola.equals(":q")) {
            System.out.print("Inserisci una stringa (scrivi ':q' per uscire): ");
            parola = scanner.nextLine();

            if (!parola.equals(":q") && !parola.isEmpty()) {
                String risultato = "";
                int i = 0;

                // Ciclo while per processare ogni carattere
                while (i < parola.length()) {
                    risultato += parola.charAt(i);

                    // Aggiunge la virgola solo se non è l'ultimo carattere
                    if (i < parola.length() - 1) {
                        risultato += ",";
                    }

                    i++;
                }

                System.out.println("Risultato: " + risultato);
            }
        }
    }
}
