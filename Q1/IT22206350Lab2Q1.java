public class IT22206350Lab2Q1 {

    public static void main(String[] args) {

        double perimeter = 100;

        // width = 3/4 of length, so perimeter = 2 * (length + 0.75 * length)
        double length = perimeter / (2 * (1 + 0.75));
        double width = 0.75 * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}
