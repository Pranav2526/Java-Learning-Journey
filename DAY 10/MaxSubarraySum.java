public class MaxSubarraySum
{
    public static void main(String args[])
    {
        int numbers[] = {1, -2, 6, -1, 3};
        MaxSumSubarray(numbers);
    }

    public static void MaxSumSubarray(int numbers[])
    {
        int MaxSum = Integer.MIN_VALUE;
        int CurrSum = 0;

        // Outer loop
        for(int i = 0; i<numbers.length; i++)
        {
            int start = i;
            for(int j = i; j<numbers.length; j++)
            {
                int end = j;
                CurrSum = 0;
                for(int k = start; k<=end; k++)
                {
                    CurrSum += numbers[k];
                }
                System.out.println(CurrSum);
                if(MaxSum < CurrSum)
                {
                    MaxSum = CurrSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Subbarray Sum: " + MaxSum);
    }
}