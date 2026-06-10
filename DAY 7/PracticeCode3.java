// Print all Prime numbers in a Range

public class PracticeCode3
{
    public static void main(String args[])
    {
       PrimesInRange(20);
    }

    public static boolean isPrime(int n)
    {
        if(n == 2)
        {
            return true;
        }

        boolean isPrime = true;

        for(int i = 2; i<=Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void PrimesInRange(int n)
    {
        for(int i = 2; i<=n; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }
}