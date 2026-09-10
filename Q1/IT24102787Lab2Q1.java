import java.util.Scanner;

public class IT24102787Lab2Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the perimeter of the fence: ");
        double perimeter = input.nextDouble();

        double length = (2 * perimeter) / 7;
        double width = (3 * perimeter) / 14;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);

        input.close();
    }
}