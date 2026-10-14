public class IT24104085Lab2Q1 {
  
    public static void main (String[] args) {

      double perimeter=100;//perimeter of the fence
     
      double width;
      double length;
     
      double width_ratio = 0.75;

      length=perimeter/(2*(1+width_ratio));

      width=width_ratio*length;

      //output to be calculate 
      System.out.println("length of the fence: "+length);
      System.out.println("width of the fence: "+width);
    
 }
}  