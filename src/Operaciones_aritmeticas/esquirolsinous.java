package Operaciones_aritmeticas;

import java.util.Scanner;

public class esquirolsinous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int esquirols = sc.nextInt();
        int nous = sc.nextInt();

        int sobrants = nous % esquirols;

        System.out.println(sobrants);

    }
}