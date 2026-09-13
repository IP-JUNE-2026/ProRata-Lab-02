public class IT24100463Lab2Q1 {
    public static void main(String[] args) {
        double perimeter = 100;
        double length, width;

        // width = (3/4) * length
        // perimeter = 2 * (length + width)
        // perimeter = 2 * (length + 0.75*length) = 2 * 1.75 * length
        length = perimeter / (2 * 1.75);
        width = 0.75 * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}