package Cadenas_De_Texto;
import java.util.Locale;
import java.util.Scanner;

public class contrasenya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String texto = sc.nextLine();

        boolean longitud = texto.length() >= 8;
        boolean mayuscula = !texto.equals(texto.toLowerCase());
        boolean minuscula = !texto.equals(texto.toUpperCase());
        boolean especial = texto.contains("*");
        boolean especial2 = texto.contains("%");
        boolean especial3 = texto.contains("&");
        boolean especial4 = texto.contains("#");
        boolean especialtodos =  especial || especial2 || especial3 || especial4;
        boolean espacios = texto.equals(texto.trim());

        boolean res = longitud && mayuscula && minuscula && especialtodos && espacios;

        System.out.println(res);

    }
}
