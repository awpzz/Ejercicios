package Castings_y_tipos;

import java.util.Locale;
import java.util.Scanner;

public class c1l22provamecano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int C = sc.nextInt();
        int E = sc.nextInt();
        int T = sc.nextInt();

        int correctas = (C-E);
        int precision = ((correctas * 100) / C);
        int velocidad = (int) ((C / 5.0) / (T / 60.0));

        System.out.println(precision);
        System.out.println(velocidad);
    }
}