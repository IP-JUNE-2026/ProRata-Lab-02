public class IT25100726Lab2Q1 {
	public static void main(String[] args){
		double perimeter = 100;
		//let's take length as L and width as W
		//As the Question is given we can build a relation between L and W using
		//W= 3L/4
		//Let's take the formula of the perimeter of the rectangle
		//P= 2L + 2W
		//replace the W with the relation of L
		//P= 2L + 2*3L/4
		//P=2L+1.5L
		//p = 3.5L
		
		//calculating Length
		double length = perimeter/3.5;
		double width = (3*length)/4;
		
		//printing the length and width
		System.out.println("Length of the fence: "+ length);
		System.out.println("Width of the fence: "+ width);
	}
}