public class IT21112164Lab2Q2 {
    public static void main(String[] args) {

        double side = 10;
        double perimeter;
        double radius;
        double pi = 22.0 / 7.0;

        perimeter = 4 * side;
        radius = perimeter / (2 * pi);

        System.out.println("Radius of the circular fence = " + radius);
    }
}