public class IT22619976Lab2Q2 {
    public static void main(String[] args) {

        double side = 10;
        double pi = 3.14;

        double squarePerimeter = 4 * side;
        double radius = squarePerimeter / (2 * pi);

        System.out.printf("Radius of the circular fence = %.2f%n", radius);
    }
}