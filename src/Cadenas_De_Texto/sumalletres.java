import java.util.Locale;
import java.util.Scanner;

public class sumalletres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String texto = sc.nextLine();

        char l1 = texto.charAt(0);
        char l2 = texto.charAt(1);
        char l3 = texto.charAt(2);
        char l4 = texto.charAt(3);
        char l5 = texto.charAt(4);

        int suma = (int) l1+l2+l3+l4+l5;

        System.out.println(suma);
    }
}
