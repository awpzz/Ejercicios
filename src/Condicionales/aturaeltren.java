package Condicionales;
import java.util.Locale;
import java.util.Scanner;

public class aturaeltren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String estado = sc.nextLine();
        int pasajeros = sc.nextInt();
        boolean obstaculos = sc.nextBoolean();

        if (estado.equals("vermell") || (obstaculos && pasajeros >0 )) {
            System.out.println("ATURAR");
        }
        else {
            System.out.println("CONTINUAR");
        }
    }
}