public class IT24103024Lab2Q2 {
    public static void main(String[] args) {
        double length = 10;
        double pi = 3.14;
        double ropeLength = 4 * length;         // perimeter of the square = the rope's fixed length
        double radius = ropeLength / (2 * pi);  // same rope as circle's circumference

        System.out.println("Radius of the circular fence: " + radius);
    }
}