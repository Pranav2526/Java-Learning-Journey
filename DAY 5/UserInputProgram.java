import java.util.*;

public class UserInputProgram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;                 // Sum of 2 numbers
        int product = num1 * num2;             // Product of 2 numbers
        int subtraction = num1 - num2;         // Subtraction of 2 numbers
        int division = num1 / num2;            // Division of 2 numbers

        System.out.println("Addition of 2 numbers: " + sum);
        System.out.println("Product of 2 numbers: " + product);
        System.out.println("Subtraction of 2 numbers: " + subtraction);
        System.out.println("Division of 2 numbers: " + division);



        // Basic Area of Circle Program
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}