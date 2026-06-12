// To print the largest and smallest value from the given array

import java.util.*;

public class PracticeCode1
{
    public static void main(String args[])
    {
        int numbers[] = {1, 2, 4, 6, 7, 3};
        int largest = get_largest_smallest(numbers);
        System.out.println("The largest no. is: " + largest);
    }

    public static int get_largest_smallest(int numbers[])
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i<numbers.length; i++)
        {
            if(largest < numbers[i])
            {
                largest = numbers[i];
            }
            if(smallest > numbers[i])
            {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest no. is: " + smallest);
        return largest;
    }
}