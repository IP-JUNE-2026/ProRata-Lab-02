public class IT22091598Lab2Q2 {
    public static void main(String[] args) {
        double sideLength = 10.0;
        
        // Perimeter of square = 4 * sideLength
        double perimeter = 4 * sideLength;
        
        // Circumference of circle = 2 * PI * radius
        // To match exact lab output, use 3.141592653589793 (or Math.PI)
        double radius = perimeter / (2 * Math.PI);

        System.out.println("Radius of the circular fence: " + radius);
    }
}