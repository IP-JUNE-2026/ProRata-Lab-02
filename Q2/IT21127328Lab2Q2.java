public class IT21127328Lab2Q2 {

    public static void main(String[] args) {

        double length = 10.0;

        double perimeter = 4 * length; // Perimeter of square = 4 * length
        
        // PI value given in hint

        double PI = 3.14;
        
        // Circumference = 2 * PI * Radius  =>  Radius = Circumference / (2 * PI)

        double radius = perimeter / (2 * PI);

        System.out.println("Radius of the circular fence: " + radius);
   
    }

}
