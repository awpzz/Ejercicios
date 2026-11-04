package Condicionales;
import java.util.Locale;
import java.util.Scanner;

public class elspetitsdavant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();

        if (numero1 <= numero2) {
            System.out.println(numero2 <= numero3);
        }

        else {
            System.out.println("false");
        }
    }
}