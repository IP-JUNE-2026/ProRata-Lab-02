public class CircularFence {
    public static void main(String[] args) {

        double length = 10;
        double pi = 3.14;

        // Find the perimeter of the square
        double perimeter = 4 * length;

        // Same rope becomes circumference of circle
        double radius = perimeter / (2 * pi);

        System.out.println("Square Perimeter = " + perimeter);
        System.out.println("Radius = " + radius);
    }
}