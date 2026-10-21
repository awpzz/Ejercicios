import java.util.Locale;
import java.util.Scanner;

public class extracciodenumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String palabra1 = sc.nextLine();

        int n1 = Character.getNumericValue(palabra1.charAt(1));
        int n2 = Character.getNumericValue(palabra1.charAt(3));
        int n3 = Character.getNumericValue(palabra1.charAt(5));
        int n4 = Character.getNumericValue(palabra1.charAt(7));

        int suma = n1 + n2 + n3 + n4;
        System.out.println(suma);

    }
}