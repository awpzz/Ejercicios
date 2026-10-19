import java.util.Locale;
import java.util.Scanner;

public class paella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float comensals = sc.nextFloat();
        float precioarroz = sc.nextFloat();
        float preciogambas = sc.nextFloat();

        System.out.println( + "kg arros");
        System.out.println( + "kg gambes");
        System.out.println( + "euros arros");
        System.out.println( + "euros gambes");
        System.out.println("TOTAL: " +  );
    }
}