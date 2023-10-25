import java.util.Scanner;

public class MidtermActivityEscoton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Routes...");
        System.out.println("The routes are:");
        System.out.println("Cebu City (Start)");
        System.out.println("Minglanilla (Route 1)");
        System.out.println("San Fernando (Route 2)");
        System.out.println("Carcar (Route 3)");
        System.out.println("Barili (Route 4.1)");
        System.out.println("Dumanjug (Route 4.1.1)");
        System.out.println("Alcantara (Route 4.1.2)");
        System.out.println("Sibonga (Route 4.2)");
        System.out.println("Dumanjug (Route 4.2.1)");
        System.out.println("Alcantara (Route 4.2.2)");
        System.out.println("Argao (Route 5)");
        System.out.println("Ronda (Route 5.1)");
        System.out.println("Alcantara (Route 5.2)");
        System.out.println("Moalboal (End)");

        System.out.println("\nDefault Routes:");
        System.out.println("Cebu City (Start)");
        System.out.println("Minglanilla (Route 1)");
        System.out.println("San Fernando (Route 2)");
        System.out.println("Carcar (Route 3)");
        System.out.println("Barili (Route 4.1)");
        System.out.println("Dumanjug (Route 4.1.1)");
        System.out.println("Alcantara (Route 4.1.2)");
        System.out.println("Sibonga (Route 4.2)");
        System.out.println("Dumanjug (Route 4.2.1)");
        System.out.println("Alcantara (Route 4.2.2)");
        System.out.println("Argao (Route 5)");
        System.out.println("Ronda (Route 5.1)");
        System.out.println("Alcantara (Route 5.2)");
        System.out.print("\nIs Barili obstructed? (1 = Yes, 0 = No): ");
        int isBariliObstructed = scanner.nextInt();

        if (isBariliObstructed == 1) {
            System.out.print("Is Dumanjug obstructed? (1 = Yes, 0 = No): ");
            int isSibongaObstructed = scanner.nextInt();
            if (isSibongaObstructed == 1) {
                System.out.println("Recommended Route:");
                System.out.println("Cebu City (Start)");
                System.out.println("Minglanilla (Route 1)");
                System.out.println("San Fernando (Route 2)");
                System.out.println("Carcar (Route 3)");
                System.out.println("Argao (Route 5)");
                System.out.println("Ronda (Route 5.1)");
                System.out.println("Alcantara (Route 5.2)");
                System.out.println("Moalboal (End)");
            } else {
                System.out.println("Recommended Route:");
                System.out.println("Cebu City (Start)");
                System.out.println("Minglanilla (Route 1)");
                System.out.println("San Fernando (Route 2)");
                System.out.println("Carcar (Route 3)");
                System.out.println("Sibonga (Route 4.2)");
                System.out.println("Dumanjug (Route 4.2.1)");
                System.out.println("Alcantara (Route 4.2.2)");
                System.out.println("Moalboal (End)");
            }
        } else {
            System.out.println("Recommended Route:");
            System.out.println("Cebu City (Start)");
            System.out.println("Minglanilla (Route 1)");
            System.out.println("San Fernando (Route 2)");
            System.out.println("Carcar (Route 3)");
            System.out.println("Barili (Route 4.1)");
            System.out.println("Dumanjug (Route 4.1.1)");
            System.out.println("Alcantara (Route 4.1.2)");
            System.out.println("Moalboal (End)");
        }
    }
}