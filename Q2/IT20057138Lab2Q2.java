class Main {
    public static void main(String[] args) {
        double side = 10;
        double PI = 3.14;

        double squarePerimeter = 4 * side;
        double radius = squarePerimeter / (2 * PI);

        System.out.printf("Radius of the circular fence = %.2f%n", radius);
    }
}
