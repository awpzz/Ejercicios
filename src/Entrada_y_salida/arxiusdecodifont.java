package Entrada_y_salida;

import java.util.Scanner;

public class arxiusdecodifont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipo1 = sc.next();
        String nombrearchivo1 = sc.nextLine();

        String tipo2 = sc.next();
        String nombrearchivo2 = sc.nextLine();

        String tipo3 = sc.next();
        String nombrearchivo3 = sc.nextLine();

        String tipo4 = sc.next();
        String nombrearchivo4 = sc.nextLine();

        System.out.println(nombrearchivo4 + " " + tipo4);
        System.out.println(nombrearchivo3 + " " + tipo3);
        System.out.println(nombrearchivo2 + " " + tipo2);
        System.out.println(nombrearchivo1 + " " + tipo1);


    }
}
