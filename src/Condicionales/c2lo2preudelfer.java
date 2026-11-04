import java.util.Locale;
import java.util.Scanner;

public class c2lo2preudelfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float distancia = sc.nextFloat();
        int cantidad = sc.nextInt();
        float precio = distancia * 0.35f;

        if (distancia >= 800.0f && cantidad >= 7) {
            precio * 0.7
        }


    }
}