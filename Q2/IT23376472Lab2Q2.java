public class IT23376472Lab2Q2 {
	public static void main (String[] args){
		
		// define the know variables
		double squareLength = 10.0;
		double pi = 3.14;
		
		// calculate the perimeter
		double perimeter = 4 * squareLength;
		
		//calculatethe redius of the circle
		double redius = perimeter / (2 * pi);
		
		System.out.println("radius of the circular fence:" + redius);
	}
}