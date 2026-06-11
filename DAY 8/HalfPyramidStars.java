// To Print Inverted and Rotated Half-Pyramid Using Stars

import java.util.*;

public class HalfPyramidStars
{
    public static void main(String agrs[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("How Many Lines to Print: ");
       int num = sc.nextInt();
       Half_Pyramid(num);

    }

    public static void Half_Pyramid(int n)
    {
        // Outer loop
        for(int i = 1; i <= n; i++)
        {
            // For Spaces
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }
            // For Stars
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        return;
    }
}