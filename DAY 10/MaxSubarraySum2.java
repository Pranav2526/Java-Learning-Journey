public class MaxSubarraySum2
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
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // Calculate Prefix
        for(int i = 1; i<prefix.length; i++)
        {
            prefix[i] = prefix[i - 1] + numbers[i];
        }


        // Outer loop
        for(int i = 0; i<numbers.length; i++)
        {
            int start = i;
            for(int j = i; j<numbers.length; j++)
            {
                int end = j;

                CurrSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];;

                if(MaxSum < CurrSum)
                {
                    MaxSum = CurrSum;
                }
            }
        }
        System.out.println("Max Subbarray Sum: " + MaxSum);
    }
}