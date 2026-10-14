public class IT22925404Lab2Q2 {
        public static void main(String[]args){
            double length = 10;
            double perimeter;
            double radius;
            double pi = 3.14;

            //perimeter = 2*pi*Radius
            perimeter = length*4;
            radius = perimeter/(2*pi);

            System.out.println("Perimeter of the square Fence: "+perimeter);
            System.out.println("Radius of the circular Fence: "+radius);
        }
}
