package Es4;

//#Esercizio #4 - for
//Scrivere un programma che chiede all'utente di inserire un numero intero e stampi il conto alla rovescia a partire
//da quel numero fino a zero

import java.util.Scanner;

public class Es4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero per farne il conto alla rovescia");
        int n = Integer.parseInt(scanner.nextLine());
        Es4 es4 = new Es4();
        es4.contoAllaRovescia(n);

    }

    public void contoAllaRovescia(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
