package Operaciones_aritmeticas;

import java.util.Scanner;

public class sortidautobus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int autobuses1 = sc.nextInt();
        int autobuses2 = sc.nextInt();
        int capacidad = sc.nextInt();

        int autobuses = autobuses1 + autobuses2;
        int pasajeros = autobuses * capacidad;

        System.out.println(pasajeros);

    }
}