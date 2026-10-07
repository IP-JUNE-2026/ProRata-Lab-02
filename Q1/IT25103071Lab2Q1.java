public class IT25103071Lab2Q1 {
    public static void main(String[] args) {
        double perimeter = 100.0;
        
        // perimeter = 2 * (length + width)
        // Since width = 0.75 * length:
        // perimeter = 2 * (length + 0.75 * length) = 3.5 * length
        double length = perimeter / 3.5;
        double width = (3.0 / 4.0) * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}