public class IT22091598Lab2Q1 {
    public static void main(String[] args) {
        double perimeter = 100.0;
        
        // Perimeter = 2 * (length + width)
        // Since width = 0.75 * length:
        // Perimeter = 2 * (length + 0.75 * length) = 2 * 1.75 * length = 3.5 * length
        double length = perimeter / 3.5;
        double width = 0.75 * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}