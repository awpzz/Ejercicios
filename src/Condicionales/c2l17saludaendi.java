package Condicionales;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class c2l17saludaendi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String idioma = sc.nextLine();

        if (idioma.equals("French")) {
            System.out.println("Bonjour");
        }
        else if (idioma.equals("Spanish")) {
            System.out.println("Hola");
        }
        else if (idioma.equals("Russian")) {
            System.out.println("Zdravstvuyte");
        }
        else if (idioma.equals("Chinese")) {
            System.out.println("Nin hao");
        }
        else if (idioma.equals("Japanese")) {
            System.out.println("Konnichiwa");
        }
        else if (idioma.equals("German")) {
            System.out.println("Guten Tag");
        }
        else if (idioma.equals("Portuguese")) {
            System.out.println("Ola");
        }
        else if (idioma.equals("Arabic")) {
            System.out.println("Asalaam alaikum");
        }
        else if (idioma.equals("Hindi")) {
            System.out.println("Namaste");
        }
        else if (idioma.equals("Romanian")) {
            System.out.println("Buna ziua");
        }

        else {
            System.out.println("No conec el teu idioma, com es diu hola?");
            String palabra = sc.nextLine();
            System.out.println(palabra);
        }
    }
}