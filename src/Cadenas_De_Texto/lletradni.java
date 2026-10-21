import java.util.Locale;
import java.util.Scanner;

public class lletradni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dni = sc.nextLine();

        String numerosdni = dni.substring(0, 7);
        String letradni = dni.substring(8);
        String calculo = "TRWAGMYFPDXBNJZSQVHLCKE";

        int numero = Integer.parseInt(numerosdni);

        int modulo = numero % 23;

        char convertir = Character.valueOf(letradni);

        char trueorfalse = calculo.charAt(modulo);
        boolean trueorfalse2 = trueorfalse == convertir;

        System.out.println(trueorfalse2);

    }
}
