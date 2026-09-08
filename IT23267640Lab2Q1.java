public class IT23267640Lab2Q1 {
   
   public static void main(string[] args) {
   
   int perimeter = 100;
   double length;
   double width;
   
   double width_ratio = 0.75;
   
   length = perimeter /(2*(1 + width_ratio));
   width = width_ratio * length;
   
   System.out.println("Length of the fence: "+length);
   System.out.println("width of the fence: " +width);
   
   }
  

}
