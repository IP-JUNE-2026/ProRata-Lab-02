public class IT23709348Lab2Q1 {
    public static void main(String[] args) {
        double perimeter = 100;
        // perimeter = 2 * (length + 3/4 * length)
        double length = perimeter / (2 * (1 + 3.0 / 4));
        double width = 3.0 / 4 * length;
        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}
