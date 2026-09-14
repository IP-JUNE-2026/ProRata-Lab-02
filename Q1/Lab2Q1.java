public class Lab2Q1 {
    public static void main(String[] args) {
        double perimeter = 100;

        // Perimeter = 2 * (length + width)
        // width = (3/4) * length
        // Perimeter = 2 * (length + 0.75 * length) = 2 * 1.75 * length

        double length = perimeter / (2 * 1.75);
        double width = 0.75 * length;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}