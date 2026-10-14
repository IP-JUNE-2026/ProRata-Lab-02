import java.util.Scanner;
public class IT20623722Lab2Q1 {

 public static void main(String[] args) {
 
		double  perimeter;
        double  width;
        double  length;

        perimeter = 100;
        //perimeter = 2*(width +length);
        //length = (4 * width)/3;
        //perimeter = 2*(width +((4 * width)/3);
        width = (perimeter *3)/14;
        length = (perimeter/2) - width;

        System.out.println("width = "+width);
        System.out.println("length = "+length);
    }
}
