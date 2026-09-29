public class IT21242786Lab2Q1 {
    public static void main(String[] args) {
        double perimeter = 100;

        // perimeter = 2 * (length + 0.75 * length) = 3.5 * length
        double length = perimeter / 3.5;
        double width = 0.75 * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}