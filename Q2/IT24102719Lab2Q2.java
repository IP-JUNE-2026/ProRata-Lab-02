public class IT24102719Lab2Q2 {
    public static void main(String[] args) {
        double side = 10;
        double PI = 22.0 / 7.0;

        // Perimeter of square = 4 * side (this becomes the rope length)
        double ropeLength = 4 * side;

        // Circumference of circle = 2 * PI * radius
        double radius = ropeLength / (2 * PI);

        System.out.println("Side of square: " + side);
        System.out.println("Rope length: " + ropeLength);
        System.out.println("Radius of circle: " + radius);
    }
}