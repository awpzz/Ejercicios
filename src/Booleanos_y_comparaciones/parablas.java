package Booleanos_y_comparaciones;

import java.util.Locale;
import java.util.Scanner;

public class parablas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String palabra1 = sc.nextLine();
        String palabra2 = sc.nextLine();

        boolean res = palabra1.equals(palabra2);

        System.out.println(res);

    }
}