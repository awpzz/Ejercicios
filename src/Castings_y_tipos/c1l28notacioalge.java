package Castings_y_tipos;

import java.util.Locale;
import java.util.Scanner;

public class c1l28notacioalge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int c = sc.nextInt() ;
        int f = sc.nextInt() ;

        char letra = (char) (c + 96);

        System.out.print(letra);
        System.out.println(f);
    }
}