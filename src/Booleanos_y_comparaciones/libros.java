package Booleanos_y_comparaciones;

import java.util.Locale;
import java.util.Scanner;

public class libros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int prestatgeries = sc.nextInt();
        int prestatges = sc.nextInt();
        int llibresprestatges = sc.nextInt();
        int llibres = sc.nextInt();

        int total = prestatges * prestatgeries * llibresprestatges;
        boolean res = total >= llibres;

        System.out.println(res);

    }
}