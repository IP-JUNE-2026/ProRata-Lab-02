public class IT24102666Lab2Q1 {
	public static void main(String[] args) {
		double length;
		double width;
		double perimeter;
		
		perimeter = 100;
		width = 3 * (perimeter/2)/7;
		length = (perimeter/2) - width;
		System.out.println("Length of the fence is " + length);
		System.out.println("Width of the fence is " + width);
		}
}