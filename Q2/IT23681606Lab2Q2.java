public class IT23681606Lab2Q2 {
    public static void main(String[] args) {

        double length = 10;
        double perimeter = 4 * length;
        double pi = 3.14;

        double radius = perimeter / (2 * pi);

        System.out.println("Length of the square: " + length);
        System.out.println("Perimeter of the square: " + perimeter);
        System.out.println("Radius of the circle: " + radius);
    }
}