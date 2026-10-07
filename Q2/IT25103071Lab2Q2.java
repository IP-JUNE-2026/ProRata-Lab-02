public class IT25103071Lab2Q2 {
    public static void main(String[] args) {
        double sideLength = 10.0;
        double perimeter = 4 * sideLength;
        
        double pi = 22.0 / 7.0; // Using 22/7 as specified in the lab hint
        double radius = perimeter / (2 * pi);

        System.out.println("Radius of the circular fence: " + radius);
    }
}