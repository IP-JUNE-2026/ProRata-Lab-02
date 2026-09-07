public class IT24100061Lab2Q1 {
   public static void main (String[] args) {
   
       double perimeter = 100.0;
	   double widthFactor = 3.0/4.0;
	   
	   double length = (perimeter/2)/(1+widthFactor);
	   double width = length*widthFactor;
	   
	   System.out.println("Length of the fence:" + length);
	   System.out.println("Width of the fence:" + width);
	   
	  }
	}
	
	 