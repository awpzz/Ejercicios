package Operaciones_aritmeticas;

import java.util.Locale;
import java.util.Scanner;

public class notamitjana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();

        float sumanotas = nota1 + nota2 + nota3;
        float mitjana = sumanotas / 3;

        System.out.println(mitjana);
    }
}