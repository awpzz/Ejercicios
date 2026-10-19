import java.util.Locale;
import java.util.Scanner;

public class relojdemanillas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float horas = sc.nextInt();
        float minutos = sc.nextInt();
        float segundos = sc.nextInt();

        float gradosHoras = (horas * 30) + (minutos * 0.5f) + (segundos * (0.5f / 60));
        float gradosMinutos = (minutos * 6) + (segundos * 0.1f);
        float gradosSegundos = segundos * 6;

        System.out.println(gradosHoras);
        System.out.println(gradosMinutos);
        System.out.println(gradosSegundos);
    }
}
