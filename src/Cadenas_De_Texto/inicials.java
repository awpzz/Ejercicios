import java.util.Locale;
import java.util.Scanner;

public class inicials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String nombre = sc.next();
        String apellido = sc.next();

        char primera = nombre.charAt(0);
        char segunda = apellido.charAt(0);

        String res = (primera + "" + segunda).toUpperCase();

        System.out.println(res);
    }
}