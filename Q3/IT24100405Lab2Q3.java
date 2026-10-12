public class IT24100405Lab2Q3 {
    public static void main(String[] args) {
        double sideA = 3.0;
        double sideB = 4.0;
        
        // Hypotenuse = square root (SideA^2 + SideB^2)
        double hypotenuse = Math.sqrt((sideA * sideA) + (sideB * sideB));
        
        System.out.println("Length of the hypotenuse: " + hypotenuse);
    }
