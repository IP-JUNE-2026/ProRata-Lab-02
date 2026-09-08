public class IT23240506Lab2Q2 {
    public static void main(String[] args) {
        double sideLength = 10.0;
        double pi = 22.0 / 7.0; 
        double perimeter = 4 * sideLength;

        double radius = perimeter / (2 * pi);

        System.out.println("Radius of the circular fence: " + radius);
    }
}