import java.util.Locale;
import java.util.Scanner;

public class treurebrossa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String palabra1 = sc.nextLine();
        String palabra2 = sc.nextLine();

        String numero1 = palabra1.substring(1);
        String numero2 = palabra2.substring(0, palabra2.length() - 2);

        int n1 = Integer.parseInt(numero1);
        int n2 = Integer.parseInt(numero2);

        int suma = n1 + n2;
        System.out.println(suma);

    }
}