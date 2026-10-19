package Entrada_y_salida;

import java.util.Scanner;

public class contractarunxef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();

        Integer edad = sc.nextInt();
        sc.nextLine();

        String nivel = sc.nextLine();

        Integer anos = sc.nextInt();
        sc.nextLine();

        String cocina = sc.nextLine();

        System.out.println("El formulari de " + nombre + " s'ha completat. Et contactarem si necessitem un xef de cuina " + cocina + ".");

    }
}
