import java.util.Arrays;
import java.util.Collections;


public class InbuiltSort
{
    public static void main(String args[])
    {
        int arr[] = {5, 4, 1, 3, 2};

        Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);    // Sort using specific index values
        // Arrays.sort(arr, Collections.reverseOrder());  // Sort in descending order, also replace int with Integer from everywhere inside the code
        // Arrays.sort(arr, 0, 3, Collections.reverseOrder());  // Sort in descending order using specific index values 
        PrintArr(arr);
    }

    public static void PrintArr(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}