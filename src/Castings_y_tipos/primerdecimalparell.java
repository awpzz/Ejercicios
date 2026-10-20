package Castings_y_tipos;

import java.util.Locale;
import java.util.Scanner;

public class primerdecimalparell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float digito = sc.nextFloat();

        digito = digito * 10;
        boolean resultado = (int) digito % 2 == 0;

        System.out.println(resultado);

    }
}