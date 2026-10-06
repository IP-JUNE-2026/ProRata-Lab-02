public class IT22091598Lab2Q3 {
    public static void main(String[] args) {
        double sideA = 3.0;
        double sideB = 4.0;
        
        // Hypotenuse = sqrt(sideA^2 + sideB^2)
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        System.out.println("Length of the hypotenuse: " + hypotenuse);
    }
}