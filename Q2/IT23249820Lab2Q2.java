public class IT23249820Lab2Q2 {

    public static void main(String[] args) {

        double squareSide = 10.0;
        double pi = 3.14;

        double squarePerimeter = 4.0 * squareSide;
        double radius = squarePerimeter / (2.0 * pi);

        System.out.println("Radius of the circular fence: " + radius);
    }
}