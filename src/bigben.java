import java.util.Locale;
import java.util.Scanner;

public class bigben {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int horaactual = sc.nextInt();
        int cantidadhoras = sc.nextInt();
        
        int hora = (horaactual + cantidadhoras) % 12;

        System.out.println(hora);

    }
}
