import java.util.Scanner;

public class Arora_MadLibs {
    public static void print() {
        Scanner sc = new Scanner(System.in);

        // Ask the user for a location
        System.out.print("Enter a location: ");
        String hauntedPlace = sc.nextLine();

        // Ask the user for the number of ghosts
        System.out.print("Enter an integer number of ghosts: ");
        int ghostCount = sc.nextInt();
    }
}
