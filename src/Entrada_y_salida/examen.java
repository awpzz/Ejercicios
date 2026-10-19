package Entrada_y_salida;

import java.util.Locale;
import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

       String linia1= sc.nextLine();
        String linia2= sc.nextLine();
        String linia3= sc.nextLine();
        String linia4= sc.nextLine();
        String linia5= sc.nextLine();
        String linia6= sc.nextLine();

        System.out.println(linia6+" "+linia5+" "+linia4+" "+linia3+" "+linia2+" "+linia1+" ");
    }
}