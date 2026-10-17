import java.util.Scanner;

public class IT23692046Lab2Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter Side A and Side B (or use the default values 3 and 4)
        System.out.print("Enter the length of Side A: ");
        double sideA = scanner.nextDouble();

        System.out.print("Enter the length of Side B: ");
        double sideB = scanner.nextDouble();

        if (sideA <= 0 || sideB <= 0) {
            System.out.println("Side lengths must be positive values.");
        } else {
            // Calculate the hypotenuse using the Pythagorean theorem: sqrt(SideA^2 + SideB^2)
            double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

            // Display the results formatted to 2 decimal places
            System.out.println("\n--- Right Triangle Calculation ---");
            System.out.printf("Side A:      %.2f\n", sideA);
            System.out.printf("Side B:      %.2f\n", sideB);
            System.out.printf("Hypotenuse:  %.2f\n", hypotenuse);
        }

        scanner.close();
    }
}