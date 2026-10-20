import java.util.Locale;
import java.util.Scanner;

public class kebabcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String texto = sc.nextLine();

        String res = texto.replace(" ", "-").toLowerCase();

        System.out.println(res);

    }
}