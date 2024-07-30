package Esercizio1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero N che rappresenti il numero di elementi da inserire:");
        int N = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline lasciato da nextInt()

        Set<String> parole = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        System.out.println("Inserisci " + N + " parole:");
        for (int i = 0; i < N; i++) {
            String parola = scanner.nextLine();
            if (!parole.add(parola)) {
                duplicate.add(parola);
            }
        }

        System.out.println("Parole duplicate:");
        for (String parola : duplicate) {
            System.out.println(parola);
        }

        System.out.println("Numero di parole distinte: " + parole.size());

        System.out.println("Elenco delle parole distinte:");
        for (String parola : parole) {
            System.out.println(parola);
        }

        scanner.close();
    }
}
