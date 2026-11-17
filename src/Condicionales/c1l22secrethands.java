package Condicionales;
import java.util.Locale;
import java.util.Scanner;

public class c1l22secrethands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int bit1 = sc.nextInt();
        int bit2 = sc.nextInt();
        int bit3 = sc.nextInt();
        int bit4 = sc.nextInt();

        if (bit1 == 1) {
            System.out.println("saltar");
        }

    }
}