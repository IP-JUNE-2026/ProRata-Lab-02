public class IT21112164Lab2Q1 {
    public static void main(String[] args) {

        double perimeter = 100;
        double length;
        double width;

        length = perimeter / (2 * (1 + 3.0 / 4.0));
        width = (3.0 / 4.0) * length;

        System.out.println("Length of the fence = " + length);
        System.out.println("Width of the fence = " + width);
    }
}