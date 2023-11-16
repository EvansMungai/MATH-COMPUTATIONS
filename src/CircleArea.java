public class CircleArea {
    public double cirlceArea(double radius) {
        final double pi = 3.14159265359;
        double area = pi * radius * radius;
        System.out.println("The area of a circle with a radius of " + radius + " is " + String.format("%.2f",area));
        return area;
    }
}
