// Code to calculate Binomial Coefficient
import java.util.*;
public class BinomialCode
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int r = sc.nextInt();
      int finalresult = BinomialCoefficient(n, r);
      System.out.println("Binomial Coefficient = " + finalresult);

    }

    public static int factorial(int n)
    {
      int f = 1;
      for(int i = 1; i<=n; i++)
       { 
          f = f * i;
       }
      return f;
    }

    public static int BinomialCoefficient(int n, int r)
    {
      int fact_n = factorial(n);
      int fact_r = factorial(r);
      int fact_nmr = factorial(n-r);

      int BinomialCoefficient = fact_n / (fact_r * fact_nmr);
      return BinomialCoefficient;
    }
}

