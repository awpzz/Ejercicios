package Bucles;
import java.util.Locale;
import java.util.Scanner;

public class obrircandau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int clave = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        while (n3 != -1) {
            if ((n1 + n2) * n3 == clave) {
                System.out.println(true);
                return;
            }
            n1=n2;
            n2=n3;
            n3=sc.nextInt();
        }
        System.out.println(false);
    }
}