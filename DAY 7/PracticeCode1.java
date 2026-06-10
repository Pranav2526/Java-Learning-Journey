// Check if a number is prime or not

public class PracticeCode1
{
    public static void main(String args[])
    {
        System.out.println(isPrime(3));
    }

    public static boolean isPrime(int n)
    {
        if(n == 2)
        {
            return true;
        }

        boolean isPrime = true;
        for(int i = 2; i<=n-1; i++)
        {
            if(n % i == 0)
            {
                isPrime = false;
            }
        }
        return isPrime;
    }
}