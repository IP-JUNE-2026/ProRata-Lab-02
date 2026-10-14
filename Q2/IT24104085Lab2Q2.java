public class IT24104085Lab2Q2 {

    public static void main(String[] arg) {
     
     double pi=3.14; // value of PI
      
      //side length of the square fence
      double side_length =10.0;

      //Calculate the perimeter of the square fence
      double perimeterSquare = 4 * side_length;

      //calculate the radius of the circule fence
      double r = perimeterSquare / (2 * 3.14);
 
      //output to be calculate radius
      System.out.println("Radius of the circular fence: "+ r);
      
     }
}
