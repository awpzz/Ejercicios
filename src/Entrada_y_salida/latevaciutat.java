package Entrada_y_salida;

import java.util.Locale;
import java.util.Scanner;

public class latevaciutat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String metro = sc.nextLine();
        String ciudad = sc.nextLine();

        System.out.println("Has obtingut plaça a \"" + ciudad + "\" i, per arribar, la parada de metro més propera és \"" + metro + "\".");


    }
}