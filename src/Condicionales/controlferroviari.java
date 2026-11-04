import java.util.Locale;
import java.util.Scanner;

public class controlferroviari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Estat del semàfor (vermell, ambar, verd):");
        String semaforo = sc.next();
        System.out.println("Fre d'emergència? (true, false):");
        boolean freno = sc.nextBoolean();
        System.out.println("Ordres del centre de control (0, 1, 2):");
        int control = sc.nextInt();

        if (!freno && control == 0 && !(semaforo.equals("vermell"))) {
            System.out.println("El tren pot continuar");
        }
        else {
            System.out.println("El tren s'ha d'aturar!!");
        }
    }
}