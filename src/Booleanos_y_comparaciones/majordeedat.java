package Booleanos_y_comparaciones;

import java.util.Locale;
import java.util.Scanner;

public class majordeedat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int edad = sc.nextInt();

        boolean res = edad >= 18;

        System.out.println(res);

    }
}