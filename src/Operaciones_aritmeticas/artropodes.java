package Operaciones_aritmeticas;

import java.util.Scanner;

public class artropodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int insectos = sc.nextInt();
        int aracnidos = sc.nextInt();
        int crustacios = sc.nextInt();
        int patas2 = sc.nextInt();
        int patas2_segmentos = sc.nextInt();
        int patas4 = sc.nextInt();
        int patas4_segmentos = sc.nextInt();

        int total = insectos * 6
                + aracnidos * 8
                + crustacios * 10
                + patas2 * patas2_segmentos * 2
                + patas4 * patas4_segmentos * 4;

        System.out.println(total);

    }
}