public class IT24103024Lab2Q1 {
    public static void main(String[] args) {
        double perimeter = 100;
        double length = perimeter / 3.5;      // from perimeter = 2*(length + 0.75*length)
        double width = (3.0 / 4.0) * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}