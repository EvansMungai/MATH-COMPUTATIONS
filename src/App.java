class Addition{
    public int addition (int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        System.out.println("The sum of the two numbers is "+ sum);
        return sum;
    }
}

class TriangleArea {
    public double triangleArea (double base, double height){
        double area = 3.14 * base * height;
        return area;
    }
}
class CirclePerimeter {
    public double circlePerimeter(double radius){
        final double pi = 3.14159265359;
        double perimeter = 2 * pi * radius;
        System.out.println("The perimeter of the cirlce of radius "+ radius+ " is "+perimeter);
        return perimeter;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Addition addition = new Addition();
        addition.addition(2,3);
    }
}
class Multplication{
    public int multiplication(int num1, int num2) {
        int multiplication=num1 * num2;
        return multiplication;
    }
}
   class CircleArea{
    public double cirlceArea(double radius) {
        final double pi = 3.14159265359;
        double area= pi * radius * radius;
        return area;
    }
} 
