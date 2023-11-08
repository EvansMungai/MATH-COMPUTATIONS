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
class CircleArea {
    public double circleArea(double radius) {
        double circleArea=Math.PI*radius*radius;
        return circleArea;
}
}
    

    
