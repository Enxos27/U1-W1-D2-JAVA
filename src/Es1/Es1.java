package Es1;

//Esercizio #1 - if-else if
//Scrivere i seguenti metodi:
//        - stringaPariDispari, che accetta una stringa e ritorna true se il numero di caratteri è pari e false se il numero di
//caratteri è dispari.
//- annoBisestile, che accetta un anno espresso come intero e ritorna true se esso è bisestile, false altrimenti.
//[Un anno per essere bisestile deve rispettare le seguenti regole:
//        - essere divisibile per 4
//        - qualora sia divisibile per 100 deve essere anche divisibile per 400

import java.util.Scanner;

public class Es1 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola per sapere se il numero dei suoi caratteri è pari o dispari");
        String parola = scanner.nextLine();
        Es1 es1 = new Es1();
        boolean res = es1.stringaPariDispari(parola);
        System.out.println("La tua parola ha un numero di caratteri pari? " + res);
        System.out.println("Inserisci un anno (xxxx) per sapere se è un anno bisestile");
        int anno = Integer.parseInt(scanner.nextLine());
        boolean res2 = es1.annoBisestile(anno);
        System.out.println("L'anno " + anno + " è bisestile? " + res2);


    }

    public boolean stringaPariDispari(String parola) {
        if (parola.length() % 2 == 0) return true;
        else return false;
    }

    public boolean annoBisestile(int anno) {
        return (anno % 400 == 0) || (anno % 4 == 0 && anno % 100 != 0);
    }
}
