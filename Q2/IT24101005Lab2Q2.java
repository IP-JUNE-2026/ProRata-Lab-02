public class IT24101005Lab2Q2 {

    public static void main(String[] args) {

        //side length of the square fence
        double sideLength = 10.0;

        // perimeter of the square fence
        double perimeterSquare = 4 * sideLength; // 4 * length

        // radius of the circular fence using the same perimeter
        // 4 * length = 2 * PI * radius
        // radius = (4 * length / 2 * PI)
        double radius = perimeterSquare / (2 * 3.14);

        // Output the calculated radius
        System.out.println("Radius of the circular fence: " + radius);

    }
}