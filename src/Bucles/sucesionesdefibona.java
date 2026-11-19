
package Bucles;
import java.util.Locale;
import java.util.Scanner;

public class sucesionesdefibona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int cantidad = sc.nextInt();
        int cont = 1;

        while (cont <= cantidad) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            boolean correcto = true;

            if (n1 != 0) {
                correcto = false;
            }

            while (n2 != -1) {
                int siguiente = sc.nextInt();

                if (siguiente != -1) {
                    if (n1 + n2 != siguiente) {
                        correcto = false;
                    }
                    n1 = n2;
                    n2 = siguiente;
                } else {
                    n2 = -1;
                }
            }

            if (correcto) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            cont++;
        }
    }
}
