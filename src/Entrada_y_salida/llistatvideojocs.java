package Entrada_y_salida;

import java.util.Locale;
import java.util.Scanner;

public class llistatvideojocs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String year = sc.next();
        String plataform = sc.nextLine();
        String comapany = sc.nextLine();
        String game = sc.nextLine();

        System.out.println(game + " " + "("+ year +")");
        System.out.println(plataform);
        System.out.println(comapany);


    }
}