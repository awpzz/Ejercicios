import java.util.Locale;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hellcome to the agenda, please choose an option: ");
        System.out.println("  1. Create a new contact.\n");
        System.out.println("  2. Search for existing contacts.\n");
        System.out.println("  3. Update an existing contact.\n");
        System.out.println("  4. Delete an existing contact. \n");
        System.out.println("  5. Exit.");

        String opcionescogida = sc.nextLine();

        System.out.println("Escogiste: " + opcionescogida + ".");
    }
}
