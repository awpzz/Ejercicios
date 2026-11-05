package Bucles;
import java.util.Locale;
import java.util.Scanner;

public class c3l03repeatx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numero = sc.nextInt();
        int contador = 0;

        while (contador<numero) {
            System.out.print(numero);
            contador++;
        }
    }
}