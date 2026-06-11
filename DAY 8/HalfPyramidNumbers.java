// Inverted Half-Pyramid with Numbers

import java.util.*;

public class HalfPyramidNumbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines to print: ");
        int n = sc.nextInt();
        Half_Pyramid(n);

    }

    public static void Half_Pyramid(int n)
    {
        // Outer Loop
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        return;
    }
}