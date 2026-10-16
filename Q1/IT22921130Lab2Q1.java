public class IT22921130Lab2Q1 {
    public static void main(String[] args) {

        double perimeter = 100;
        double length, width;

        // width = (3/4) * length
        // perimeter = 2 * (length + width)

        length = perimeter / 3.5;   // derived equation
        width = (3.0 / 4.0) * length;

        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
    }
}