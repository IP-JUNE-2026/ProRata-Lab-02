public class IT25100726Lab2Q3{
	public static void main(String[] args){
		//given sides
		double sideA=3;
		double sideB=4;
		// step 1:calculate the square of both sides and add them
		double sumofSquares= (sideA*sideA)+(sideB*sideB);
		//step 2: find the square root of the sum to get the hypotenuse
		double hypotenuse=Math.sqrt(sumofSquares);
		//display the result
		System.out.println("Length of the hypotenuse:"+hypotenuse);
	}
}