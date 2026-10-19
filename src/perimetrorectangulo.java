import java.util.Locale;
import java.util.Scanner;

public class perimetrorectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int posicionhor1 = sc.nextInt();
        int posicionver1 = sc.nextInt();
        int posicionhor2 = sc.nextInt();
        int posicionver2 = sc.nextInt();

        int ancho = posicionhor1 - posicionhor2;
        int alto = posicionver1 - posicionver2;

        int res = (ancho * 2) + (alto * 2);

        System.out.println(res);
    }
}
