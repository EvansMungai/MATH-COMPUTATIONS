public class CirclePerimeter {
    public double circlePerimeter(double radius) {
        final double pi = 3.14159265359;
        double perimeter = 2 * pi * radius;
        System.out.println("The perimeter of the cirlce of radius " + radius + " is " + perimeter);
        return perimeter;
    }
}
