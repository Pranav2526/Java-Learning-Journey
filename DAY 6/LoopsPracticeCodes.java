import java.util.*;

public class LoopsPracticeCodes
{
    public static void main(String args[])
    {
        // Print numbers from 1 to 10 using while loop
        int num = 1;
        while(num<=10)
        {
            System.out.println(num);
            num++;
        }


        // Print numbers from 1 to n by taking user input using while loop
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int n = 1;
        while(n<=num1)
        {
            System.out.print(n + "  ");
            n++;
        }
        System.out.println();


        // Print sum of firnt N natural numbers using while loop
        int num2 = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=num2)
        {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);


        // Print reverse of a number using while loop
        int num3 = 12345;
        while(num3>0)
        {
            int LastDigit = num3 % 10;
            System.out.print(LastDigit);
            num3 = num3 / 10;
        }


        // Reverse the given number using while loop
        int num4 = 54321;
        int rev = 0;
        while(num4>0)
        {
            int LastDigit = num4 % 10;
            rev = (rev*10) + LastDigit;
            num4 = num4/10;
        }
        System.out.println("  " + rev);
    }
}