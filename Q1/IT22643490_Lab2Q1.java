public class IT22643490_Lab2Q1 {
    public static void main(String[] args) {

        double perimeter = 100;

        // width = 3/4 of length
        // 2 * (length + width) = 100
        // Solve for length
        double length = (perimeter * 2) / 7;
        double width = (3.0 / 4) * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}