package Condicionales;
import java.util.Locale;
import java.util.Scanner;

public class c1l19sobrenous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int huevos = sc.nextInt();
        int hueveras = huevos / 24;
        int extra = 0;

        if (huevos % 24 != 0) {
            hueveras++;
            extra = 24 - (huevos % 24);
        }

        System.out.println(hueveras + " " + extra);
    }
}