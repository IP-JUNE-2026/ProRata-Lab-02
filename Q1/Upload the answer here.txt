import java.util.Scanner;

public class IT21802812Lab2Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the perimeter of the fence: ");
        double perimeter = input.nextDouble();

        // width = 3/4 * length
        // perimeter = 2 * (length + width)
        // perimeter = 2 * (length + 0.75 * length)
        // perimeter = 2 * 1.75 * length
        // length = perimeter / (2 * 1.75)

        double length = perimeter / (2 * 1.75);
        double width = 0.75 * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);

        input.close();
    }
}
