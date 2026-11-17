package Bucles;
import java.util.Locale;
import java.util.Scanner;

public class e9bedgeneradordec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        while (n2 != 0) {
            while (n1<n2 || n1>n2) {
                if () {


                n1 = n2;
                n2 = sc.nextInt();
                else if (n1>n2) {
                    n1 = n2;
                    n2 = sc.nextInt();
                }
            }
            System.out.println("CORRECTE");
            break;
        }
    }
}
