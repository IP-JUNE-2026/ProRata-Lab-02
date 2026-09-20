public class IT23249820Lab2Q1 {

    public static void main(String[] args) {

        double perimeter = 100.0;
        double widthRatio = 3.0 / 4.0;

        double length = perimeter / (2.0 * (1.0 + widthRatio));
        double width = widthRatio * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}