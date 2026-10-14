public class IT22925404Lab2Q1 {
        public static void main(String[]args){
            double perimeter = 100;
            double length;
            double width;

            //perimeter = 2(length+3/4*length)
            length = perimeter/3.5;
            width = (3.0/4.0)*length;

            System.out.println("Length of the Fence: "+length);
            System.out.println("Width of the Fence: "+width);
        }
}
