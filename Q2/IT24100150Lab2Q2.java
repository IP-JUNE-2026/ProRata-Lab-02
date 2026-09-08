public class IT24100150Lab2Q2{
	public static void main(String[] args){
		double sideLength = 10.0;
		double perimeterOfSquare = 4.0 * sideLength;
		
		double pi = 3.14;
		double radius = perimeterOfSquare/(2.0 * pi);
		
		System.out.println("Radius of the circular fence: " + radius);
	}
}