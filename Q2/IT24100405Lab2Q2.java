public class IT24100405Lab2Q2 {
    public static void main(String[] args) {
        double lengthOfSquareSide = 10.0;
        double perimeterOfSquare = 4 * lengthOfSquareSide;
        
        // The circumference of the circle is equal to the perimeter of the square
        double pi = 3.14;
        double radius = perimeterOfSquare / (2 * pi);
        
        System.out.println("Radius of the circular fence: " + radius);
    }
}