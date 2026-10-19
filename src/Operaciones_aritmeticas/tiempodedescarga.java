package Operaciones_aritmeticas;

import java.util.Scanner;

public class tiempodedescarga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int velocidad = sc.nextInt();
        int tamaño = sc.nextInt();

        int tiempo = tamaño * 1024;
        int tiempo2 = tiempo / velocidad;


        System.out.println(tiempo2);

    }
}