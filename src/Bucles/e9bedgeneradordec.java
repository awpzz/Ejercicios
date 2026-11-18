package Bucles;
import java.util.Locale;
import java.util.Scanner;

public class e9bedgeneradordec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 < n2) {
            while (n2 != 0) {
                while (n1 < n2) {
                    n1 = n2;
                    n2 = sc.nextInt();
                    if (n1 > n2 && n2 != 0) {
                        n1 = n2;
                        n2 = sc.nextInt();
                    } else {
                        System.out.println("INCORRECTE");
                        return;
                    }
                }
            }
            System.out.println("CORRECTE");
        }
        else {
            System.out.println("INCORRECTE");
        }
    }
}