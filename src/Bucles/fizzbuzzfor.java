package Bucles;
import java.util.Locale;
import java.util.Scanner;

public class fizzbuzzfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int contador = a;

        do {
            if (contador % 3 == 0 && contador % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (contador % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (contador % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(contador);
            }
            contador--;
        }
        while (contador>=b);
    }
}