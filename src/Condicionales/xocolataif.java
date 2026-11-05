package Condicionales;
import java.util.Locale;
import java.util.Scanner;

public class xocolataif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int ancho = sc.nextInt();
        int altura = sc.nextInt();
        int cuadrados = sc.nextInt();
        int cuadradostotales = ancho * altura;

        if ((ancho % 2 == 0) || (altura % 2 == 0) || cuadrados % 2 == 0 || cuadrados <= cuadradostotales) {
            System.out.println("SI");
        }
        else {
            System.out.println("NO");
        }
    }
}