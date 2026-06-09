import java.util.*;

public class FunctionParameters
{
    public static int addnumbers(int num1, int num2) // Parameters or Formal Parameters --> Defintion
    {
        int sum = num1 + num2;
        return sum;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = addnumbers(num1, num2);  // Actual Parameters or Arguments --> Call
        System.out.println("Sum of these 2 numbers: " + sum);
    }
}