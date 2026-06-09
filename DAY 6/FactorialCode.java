// To find Factorial of a number, n
import java.util.*;

public static int factorial(int n)
{
    int f = 1;
    for(int i = 1; i<=n; i++)
    {
        f = f * i;
    }
    return f;
}

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    n = factorial(n);
    System.out.println("Factoial of the given number is: " + n);
}