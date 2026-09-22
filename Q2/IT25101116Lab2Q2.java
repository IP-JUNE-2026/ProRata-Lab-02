public class IT26101614Lab2Q2{
	
        public static void main(String[] args){
			
		double sidelength = 10;
		double PI = 22.0/7;
		double perimetersquare = 4 * sidelength;
		
		//perimetersquare = circumference
		//circumference = 2 * PI * radius
		double radius = perimetersquare/2*PI;
		
		System.out.println("radius of the circular fence: " + radius);
		}
}