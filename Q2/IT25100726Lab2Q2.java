public class IT25100726Lab2Q2{
	public static void main(String[] args){
		//given values
		double squareside=10;
		//length of one side of the square
		double pi = 3.14;
		//step 1:calculate perimeter of the square
		double perimeter =4*squareside;
		//step 2: calculate radius of the circle
		// since perimeter of square = circumference of circle
		double radius = perimeter/(2*pi);
		//display result
		System.out.println("Radius of the circular fence: " + radius);
	}
}