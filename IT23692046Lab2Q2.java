import java.util.Scanner;

public class IT23692046Lab2Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the side length of the square
        System.out.print("Enter the side length of the square fence: ");
        double sideLength = scanner.nextDouble();

        if (sideLength <= 0) {
            System.out.println("Side length must be a positive value.");
        } else {
            // Step 1: Find the length of the rope (Perimeter of the square)
            double ropeLength = 4 * sideLength;

            // Step 2: Define PI as specified (22/7 or 3.14)
            double pi = 22.0 / 7.0;

            // Step 3: Calculate the radius of the circular fence
            // Circumference = 2 * PI * Radius  =>  Radius = Circumference / (2 * PI)
            double radius = ropeLength / (2 * pi);

            // Display the results formatted to 2 decimal places
            System.out.println("\n--- Fence Conversion Results ---");
            System.out.printf("Rope Length (Perimeter): %.2f\n", ropeLength);
            System.out.printf("Radius of Circular Fence:  %.2f\n", radius);
        }

        scanner.close();
    }
}