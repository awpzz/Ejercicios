package Entrada_y_salida;

import java.util.Scanner;

public class cartaformal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tractament = sc.nextLine();
        String nom = sc.nextLine();
        String cognom1 = sc.nextLine();
        String cognom2 = sc.nextLine();


        System.out.println(tractament + " " + cognom1 + " " + cognom2 + ", " + nom);

        System.out.println("El principal objectiu de la present carta...");

    }
}
