
public class IT24100169Lab2Q2 {
    public static void main(String[] args) {
        double side = 10;
        double perimeter = 4 * side;          // rope length

        // Circumference = 2 * π * radius
        // radius = perimeter / (2 * π)
        double radius = perimeter / (2 * Math.PI);

        System.out.println("Radius of the circular fence: " + radius);
    }
}