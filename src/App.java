import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            try{
            System.out.println("\t\t\tCALCULATOR");
            System.out.println("\t\tSelect between the operation you want to perform (1-9)");
            System.out.println("\t1: Addition");
            System.out.println("\t2: Subtraction");
            System.out.println("\t3: Multiplication");
            System.out.println("\t4: Division");
            System.out.println("\t5: Rectangle Perimeter");
            System.out.println("\t6: Triangle Area");
            System.out.println("\t7: Circle Area");
            System.out.println("\t8: Circle Perimeter");
            System.out.println("\t9: Exit");
            System.out.print("Choice: ");
            int choices = in.nextInt();
            switch (choices) {
                case 1:
                    System.out.println("Addition Class");
                    Addition addition = new Addition();
                    System.out.println("Enter the two numbers you want to add");
                    System.out.println("Number 1");
                    int num1 = in.nextInt();
                    System.out.println("Number 2");
                    int num2 = in.nextInt();
                    addition.addition(num1, num2);
                    break;

                case 2:
                    System.out.println("Subtraction Class");
                    System.out.println("Enter the two numbers you want to subtract");
                    System.out.println("Number 1");
                    int num3 = in.nextInt();
                    System.out.println("Number 2");
                    int num4 = in.nextInt();
                    Subtraction subtraction = new Subtraction();
                    subtraction.subtraction(num3, num4);
                    break;
                case 3:
                    System.out.println("Multiplication Class");
                    System.out.println("Enter the two numbers you want to multiply");
                    System.out.println("Number 1");
                    int num5 = in.nextInt();
                    System.out.println("Number 2");
                    int num6 = in.nextInt();
                    Multiplication multiplication = new Multiplication();
                    multiplication.multiplication(num5, num6);
                    break;
                case 4:
                    System.out.println("Division Class");
                    System.out.println("Enter the two numbers you want to divide");
                    System.out.println("Number 1");
                    int num7 = in.nextInt();
                    System.out.println("Number 2");
                    int num8 = in.nextInt();
                    Division division = new Division();
                    division.division(num7, num8);
                    break;
                case 5:
                    System.out.println("Rectangle Perimeter Class");
                    System.out.println("Enter the length and width of the rectangle");
                    System.out.println("Length: ");
                    int num9 = in.nextInt();
                    System.out.println("Width:");
                    int num10 = in.nextInt();
                    RectanglePerimeter rectanglePerimeter = new RectanglePerimeter();
                    rectanglePerimeter.rectperimeter(num9, num10);
                    break;
                case 6:
                    System.out.println("Triangle Area class");
                    System.out.println("Enter the base and height of the triangle");
                    System.out.println("Base: ");
                    int num11 = in.nextInt();
                    System.out.println("Height:");
                    int num12 = in.nextInt();
                    TriangleArea triangleArea = new TriangleArea();
                    triangleArea.triangleArea(num11, num12);
                    break;
                case 7:
                    System.out.println("Circle Area Class");
                    System.out.println("Enter the radius of the circle");
                    System.out.println("Radius: ");
                    int num13 = in.nextInt();
                    CircleArea circleArea = new CircleArea();
                    circleArea.cirlceArea(num13);
                    break;
                case 8:
                    System.out.println("Circle Perimeter class");
                    System.out.println("Enter the radius of the circle");
                    System.out.println("Radius: ");
                    int num14 = in.nextInt();
                    CirclePerimeter circlePerimeter = new CirclePerimeter();
                    circlePerimeter.circlePerimeter(num14);
                    break;
                case 9:
                    System.out.println("Exit!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            }catch (InputMismatchException e) {
                // Catch InputMismatchException if the user enters a non-integer
                System.out.println("Invalid input. Please enter a valid integer.");
                // Consume the invalid input to avoid an infinite loop
                in.next();
            }
        }
        in.close();
    }
}
