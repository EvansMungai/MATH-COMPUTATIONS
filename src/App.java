class Addition{
    public int addition (int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        System.out.println("The sum of the two numbers is "+ sum);
        return sum;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Addition addition = new Addition();
        addition.addition(2,3);
    }
}
