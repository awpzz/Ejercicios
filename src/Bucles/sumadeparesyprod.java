package Bucles;
import java.util.Locale;
import java.util.Scanner;

public class sumadeparesyprod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        do {
            sc.nextInt();
            if (sc.nextInt() % 2 != 0) {
                int sumaimpar = sc.nextInt();
                //sumaimpar + sc.nextInt();
            }
            else if (sc.nextInt() % 3 != 0) {
                int sumapar = sc.nextInt();
                //sumapar + sc.nextInt();
            }
        }
        while  (sc.nextInt() != -1);

        System.out.println();
        System.out.println();
    }
}