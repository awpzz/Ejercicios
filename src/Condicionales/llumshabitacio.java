package Condicionales;
import java.util.Locale;
import java.util.Scanner;

public class llumshabitacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean luz1 = sc.nextBoolean();
        boolean luz2 = sc.nextBoolean();
        boolean luz3 = sc.nextBoolean();
        int contador = 0;


        if (luz1 == true) {
            contador++;
        }
        if (luz2 == true) {
            contador++;
        }
        if (luz3 == true) {
            contador++;
        }


        if (contador == 1) {
            System.out.println("Només hi ha un llum encès.");
        }
        else if (contador == 2) {
            System.out.println("S'han encès dues llums.");
        }
        else if (contador == 3) {
            System.out.println("S'han encès totes les llums.");
        }
        else {
            System.out.println("No s'ha encès cap llum.");
        }
    }
}