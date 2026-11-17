package Bucles;
import java.util.Locale;
import java.util.Scanner;

public class galib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float altura = sc.nextFloat();
        int puentes = sc.nextInt();
        float alturapuentes1 = sc.nextFloat();
        int contador = 1;

        while (contador <= puentes-1)  {
            if (alturapuentes1 < altura) {
                System.out.println("xoca amb el pont " + contador);
                return;
            }
            alturapuentes1 = sc.nextFloat();
            contador++;
        }
    }
}