class Main {
    public static void main(String[] args) {
        double sideA = 3;
        double sideB = 4;

        double hypotenuse = Math.sqrt((sideA * sideA) + (sideB * sideB));

        System.out.printf("Hypotenuse = %.1f%n", hypotenuse);
    }
}
