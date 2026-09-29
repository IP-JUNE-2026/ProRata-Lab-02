public class IT21242786Lab2Q2 {
    public static void main(String[] args) {
        double side = 10;
        double pi = 3.14;

        // Rope length = perimeter of the square
        double ropeLength = 4 * side;

        // Circumference = 2 * PI * radius
        double radius = ropeLength / (2 * pi);

        System.out.println("Radius of the circular fence: " + radius);
    }
}