public class ComputeArea {
    public static void main(String[] args) {

        double base = 4.0;
        double height = 6.0;
        final double pi = 3.14;   
        double radius = 8.0;

        double areaOfSquare = base * base;
        double areaOfTriangle = 0.5 * base * height;
        double areaOfCircle = pi * radius * radius;

        System.out.print(
            "The area of square is " + areaOfSquare + "\n" +
            "The area of triangle is " + areaOfTriangle + "\n" +
            "The area of circle is " + areaOfCircle
        );
}
}
