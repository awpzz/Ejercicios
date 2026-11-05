package Bucles;
import java.util.Locale;
import java.util.Scanner;

public class c3l04divisiblesp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int contador = a;

        do {
            if (contador % 3 == 0) {
                System.out.println(contador);
            }
            contador++;
        }
        while (contador<=b);
    }
}