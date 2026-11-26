public class IT25100230Lab2Q2 {
    public static void main(String[] args) {
        final double PI = 3.14;
        double sideLength = 10;

        double ropeLength = 4 * sideLength;

        double radius = ropeLength / (2 * PI);

        System.out.println("Radius of the circular fence: " + radius);
    }
}
