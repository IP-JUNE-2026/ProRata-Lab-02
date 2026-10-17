public class IT22889942Lab2Q2 {
    public static void main(String[] args) {
        double side = 10;
        double perimeter = 4 * side;          // rope length
        double PI = 3.14;                     // use 22.0/7 for the other answer
        double radius = perimeter / (2 * PI);

        System.out.println("Radius of the circular fence: " + radius);
    }
}