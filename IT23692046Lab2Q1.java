import java.util.Scanner;

public class IT23692046Lab2Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the perimeter
        System.out.print("Enter the perimeter of the rectangular fence: ");
        double perimeter = scanner.nextDouble();

        // Validation for positive perimeter values
        if (perimeter <= 0) {
            System.out.println("Perimeter must be a positive value.");
        } else {
            // Since Perimeter = 2 * (length + width) and width = 0.75 * length
            // Perimeter = 3.5 * length
            double length = perimeter / 3.5;
            double width = 0.75 * length;

            // Display the results formatted to 2 decimal places
            System.out.println("\n--- Fence Dimensions ---");
            System.out.printf("Length: %.2f\n", length);
            System.out.printf("Width:  %.2f\n", width);
        }

        scanner.close();
    }
}