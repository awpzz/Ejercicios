package Condicionales;
import java.util.Locale;
import java.util.Scanner;

public class c1l18lligadefut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int partidosGanadosA = sc.nextInt() * 3;
        int partidosEmpatadosA = sc.nextInt();
        int partidosPerdidosA = sc.nextInt();
        int cantidadGolesAFavorA = sc.nextInt();
        int cantidadGolesEnContraA = sc.nextInt();

        int partidosGanadosB = sc.nextInt() * 3;
        int partidosEmpatadosB = sc.nextInt();
        int partidosPerdidosB = sc.nextInt();
        int cantidadGolesAFavorB = sc.nextInt();
        int cantidadGolesEnContraB = sc.nextInt();

        if ((partidosGanadosA + partidosEmpatadosA) > (partidosGanadosB + partidosEmpatadosB)) {
            System.out.print(true);
        }
        else if ((partidosGanadosA + partidosEmpatadosA) == (partidosGanadosB + partidosEmpatadosB)) {
            int golesA = cantidadGolesAFavorA - cantidadGolesEnContraA;
            int golesB = cantidadGolesAFavorB - cantidadGolesEnContraB;
            System.out.print(golesA>golesB);
        }
        else {
            System.out.print(false);
        }
    }
}