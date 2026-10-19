import java.util.Locale;
import java.util.Scanner;

public class trainbird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float distanciatren = sc.nextFloat();
        float velocidadtren = sc.nextFloat();
        float velocidadpajaro = sc.nextFloat();

        float tiempotren = distanciatren / velocidadtren;
        float res = tiempotren * velocidadpajaro;

        System.out.println(res);

    }
}
