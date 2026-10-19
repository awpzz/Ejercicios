import java.util.Locale;
import java.util.Scanner;

public class minparafindeaño {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int horas = sc.nextInt();
        int minreloj = sc.nextInt();
        
        int horasreloj = horas * 60;
        int tiempopasado = horasreloj + minreloj;

        int res = 1440 - tiempopasado;

        System.out.println(res);

    }
}
