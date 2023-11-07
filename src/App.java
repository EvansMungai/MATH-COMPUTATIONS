class Addition{
    public int addition (int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        System.out.println("The sum of the two numbers is "+ sum);
        return sum;
    }
}

class TriangleArea {
    public double TriangleArea (double base, double height){
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
