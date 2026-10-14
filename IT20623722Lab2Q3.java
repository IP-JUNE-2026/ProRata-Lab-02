import java.util.Scanner;
public class IT20623722Lab2Q3 {

 public static void main(String[] args) {
 
		
        double  lengthSideA;
        double  lengthSideB;
        double hypotenuse;

        lengthSideA = 3;
        lengthSideB = 4;

        //Math.pow(hypotenuse,2) = Math.pow(lengthSideA,2) + Math.pow(lengthSideB,2);
        hypotenuse = Math.sqrt(Math.pow(lengthSideA,2) + Math.pow(lengthSideB,2));

        System.out.println("hypotenuse = "+ hypotenuse);
    }
}
