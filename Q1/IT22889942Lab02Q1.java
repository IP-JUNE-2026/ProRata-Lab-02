public class IT22889942Lab02Q1 {
    public static void main(String[] args) {
        double perimeter = 100;
        double length = perimeter / 3.5;      // since 2*(L + 0.75L) = 3.5L
        double width = 0.75 * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}